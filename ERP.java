import java.util.*;

class Sale {
    String prodName;
    int NOS;
    float mrp;
    String expiry;

    Sale(String prodName, int NOS, float mrp, String expiry) {
        this.prodName = prodName;
        this.NOS = NOS;
        this.mrp = mrp;
        this.expiry = expiry;
    }
}

class Key {
    String prodName;
    String batchNum;

    Key(String prodName, String batchNum) {
        this.prodName = prodName;
        this.batchNum = batchNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Key key = (Key) o;
        return prodName.equalsIgnoreCase(key.prodName) &&
                batchNum.equalsIgnoreCase(key.batchNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodName.toLowerCase(), batchNum.toLowerCase());
    }
}

class KeyValue {
    float mrp;
    String expiry;
    int NOS;

    KeyValue(int NOS, float mrp, String expiry) {
        this.NOS = NOS;
        this.mrp = mrp;
        this.expiry = expiry;
    }
}

class Bill {
    int billNumber;
    String customerName;
    ArrayList<Sale> saleList;
    float totalAmount;

    Bill(int billNumber, String customerName, ArrayList<Sale> saleList, float totalAmount) {
        this.billNumber = billNumber;
        this.customerName = customerName;
        this.saleList = saleList;
        this.totalAmount = totalAmount;
    }
}

class Data {
    static HashMap<Key, KeyValue> prod = new HashMap<>();
    static int billCounter = 1001;
    static HashMap<Integer, Bill> billHistory = new HashMap<>();

    static void Entry(Scanner scanner) {
        scanner.nextLine();
        System.out.print("-> Enter Product Name: ");
        String prodName = scanner.nextLine();

        System.out.print("-> Enter Batch Number: ");
        String batchNum = scanner.nextLine();

        System.out.print("-> Enter NOS: ");
        int NOS = scanner.nextInt();

        System.out.print("-> Enter MRP: ");
        float mrp = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("-> Enter Expiry Date: ");
        String expiry = scanner.nextLine();

        Key key = new Key(prodName, batchNum);
        KeyValue value = new KeyValue(NOS, mrp, expiry);
        prod.put(key, value);

        System.out.println("✅ Product added successfully.");
    }

    static void Delete(Scanner scanner) {
        scanner.nextLine();
        System.out.print("-> Enter Product Name: ");
        String prodName = scanner.nextLine();

        System.out.print("-> Enter Batch Number: ");
        String batchNum = scanner.nextLine();

        Key key = new Key(prodName, batchNum);
        if (prod.containsKey(key)) {
            prod.remove(key);
            System.out.println("✅ Product removed successfully.");
        } else {
            System.out.println("⚠️ Product not found.");
        }
    }

    static void Edit(Scanner scanner) {
        scanner.nextLine();
        System.out.print("-> Enter Product Name: ");
        String prodName = scanner.nextLine();

        System.out.print("-> Enter Batch Number: ");
        String batchNum = scanner.nextLine();

        Key key = new Key(prodName, batchNum);
        if (prod.containsKey(key)) {
            System.out.print("-> Enter NOS: ");
            int NOS = scanner.nextInt();

            System.out.print("-> Enter MRP: ");
            float mrp = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("-> Enter Expiry Date: ");
            String expiry = scanner.nextLine();

            KeyValue newValue = new KeyValue(NOS, mrp, expiry);
            prod.put(key, newValue);
            System.out.println("✅ Edited successfully.");
        } else {
            System.out.println("⚠️ Product not found.");
        }
    }

    static void display(Scanner scanner) {
        scanner.nextLine();
        System.out.print("-> Enter Product Name: ");
        String prodName = scanner.nextLine();

        boolean found = false;
        for (Key key : prod.keySet()) {
            if (key.prodName.equalsIgnoreCase(prodName)) {
                KeyValue val = prod.get(key);
                System.out.println("\n********* Product Details *********");
                System.out.println("   Batch   : " + key.batchNum);
                System.out.println("   NOS     : " + val.NOS);
                System.out.println("   MRP     : ₹" + val.mrp);
                System.out.println("   Expiry  : " + val.expiry);
                System.out.println("------------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("⚠️ No products found with name: " + prodName);
        }
    }

    static void generateBill(Scanner scanner) {
        scanner.nextLine();
        System.out.print("-> Customer Name: ");
        String name = scanner.nextLine();

        ArrayList<Sale> saleList = new ArrayList<>();
        float totalBill = 0;

        while (true) {
            System.out.print("-> Enter Product Name (or type 'done' to finish): ");
            String prodName = scanner.nextLine();
            if (prodName.equalsIgnoreCase("done"))
                break;

            List<Map.Entry<Key, KeyValue>> matching = new ArrayList<>();
            for (Map.Entry<Key, KeyValue> entry : prod.entrySet()) {
                if (entry.getKey().prodName.equalsIgnoreCase(prodName)) {
                    matching.add(entry);
                }
            }

            if (matching.isEmpty()) {
                System.out.println("⚠️ Product not found.");
                continue;
            }

            int totalNOS = matching.stream().mapToInt(e -> e.getValue().NOS).sum();
            System.out.println("-> Available NOS: " + totalNOS);
            System.out.print("-> Enter NOS to purchase: ");
            int requestedNOS = scanner.nextInt();
            scanner.nextLine();

            if (requestedNOS > totalNOS) {
                System.out.println("⚠️ Not enough stock.");
                continue;
            }

            int remaining = requestedNOS;
            for (Map.Entry<Key, KeyValue> entry : matching) {
                if (remaining == 0)
                    break;

                KeyValue kv = entry.getValue();
                int used = Math.min(remaining, kv.NOS);
                kv.NOS -= used;
                remaining -= used;

                saleList.add(new Sale(prodName, used, kv.mrp, kv.expiry));
                totalBill += used * kv.mrp;
            }

            System.out.println("✅ Added to bill.\n");
        }

        if (saleList.isEmpty()) {
            System.out.println("⚠️ No items billed.");
            return;
        }

        int currentBillNo = billCounter++;
        billHistory.put(currentBillNo, new Bill(currentBillNo, name, new ArrayList<>(saleList), totalBill));

        // Print final bill
        System.out.println("\n==================== BILL =====================");
        System.out.println("Bill No       : " + currentBillNo);
        System.out.println("Customer Name : " + name);
        System.out.println("------------------------------------------------");
        System.out.printf("%-15s %-7s %-8s %-10s %-12s\n", "Product", "Qty", "MRP", "Total", "Expiry");

        for (Sale s : saleList) {
            float subTotal = s.NOS * s.mrp;
            System.out.printf("%-15s %-7d ₹%-7.2f ₹%-9.2f %-12s\n", s.prodName, s.NOS, s.mrp, subTotal, s.expiry);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("%-30s ₹%-9.2f\n", "Total Bill:", totalBill);
        System.out.println("================================================\n");
    }

    static void editBill(Scanner scanner) {
        System.out.print("-> Enter Bill Number to Edit: ");
        int billNo = scanner.nextInt();
        scanner.nextLine();

        if (!billHistory.containsKey(billNo)) {
            System.out.println("⚠️ Bill not found.");
            return;
        }

        Bill bill = billHistory.get(billNo);
        System.out.println("Customer Name: " + bill.customerName);
        System.out.println("Items in Bill:");
        for (int i = 0; i < bill.saleList.size(); i++) {
            Sale s = bill.saleList.get(i);
            System.out.printf("%d) %s - Qty: %d, MRP: ₹%.2f, Expiry: %s\n",
                    i + 1, s.prodName, s.NOS, s.mrp, s.expiry);
        }

        System.out.print("-> Enter item number to edit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= bill.saleList.size()) {
            System.out.println("⚠️ Invalid item number.");
            return;
        }

        Sale sale = bill.saleList.get(index);
        System.out.println("Editing: " + sale.prodName + ", Qty: " + sale.NOS + ", Expiry: " + sale.expiry);

        System.out.print("-> Enter new NOS (or -1 to keep same): ");
        int newNOS = scanner.nextInt();
        scanner.nextLine();

        if (newNOS >= 0 && newNOS != sale.NOS) {
            int oldNOS = sale.NOS;
            int difference = newNOS - oldNOS;

            // Find the correct Key in prod map
            Key matchedKey = null;
            for (Key k : prod.keySet()) {
                KeyValue kv = prod.get(k);
                if (k.prodName.equalsIgnoreCase(sale.prodName) && kv.mrp == sale.mrp
                        && kv.expiry.equalsIgnoreCase(sale.expiry)) {
                    matchedKey = k;
                    break;
                }
            }

            if (matchedKey == null) {
                System.out.println("❌ Original product batch not found in inventory.");
                return;
            }

            KeyValue kv = prod.get(matchedKey);

            if (difference > 0) {
                // Need to reduce from stock
                if (kv.NOS >= difference) {
                    kv.NOS -= difference;
                    sale.NOS = newNOS;
                } else {
                    System.out.println("❌ Not enough stock to increase. Available: " + kv.NOS);
                    return;
                }
            } else {
                // Add back to stock
                kv.NOS += (-difference);
                sale.NOS = newNOS;
            }
        }

        // Recalculate total
        float newTotal = 0;
        for (Sale s : bill.saleList) {
            newTotal += s.NOS * s.mrp;
        }
        bill.totalAmount = newTotal;

        System.out.println("✅ Bill and stock updated successfully.");

        // Print updated bill
        System.out.println("\n==================== UPDATED BILL =====================");
        System.out.println("Bill No       : " + bill.billNumber);
        System.out.println("Customer Name : " + bill.customerName);
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-15s %-7s %-8s %-10s %-12s\n", "Product", "Qty", "MRP", "Total", "Expiry");

        for (Sale s : bill.saleList) {
            float subTotal = s.NOS * s.mrp;
            System.out.printf("%-15s %-7d ₹%-7.2f ₹%-9.2f %-12s\n", s.prodName, s.NOS, s.mrp, subTotal, s.expiry);
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-30s ₹%-9.2f\n", "Total Bill:", bill.totalAmount);
        System.out.println("========================================================\n");
    }

    static void deleteBill(Scanner scanner) {
        System.out.print("-> Enter Bill Number to delete: ");
        int billNo = scanner.nextInt();

        if (!billHistory.containsKey(billNo)) {
            System.out.println("⚠️ Bill not found.");
            return;
        }

        Bill bill = billHistory.remove(billNo);

        for (Sale s : bill.saleList) {
            for (Map.Entry<Key, KeyValue> entry : prod.entrySet()) {
                if (entry.getKey().prodName.equalsIgnoreCase(s.prodName) &&
                        entry.getValue().mrp == s.mrp &&
                        entry.getValue().expiry.equalsIgnoreCase(s.expiry)) {
                    entry.getValue().NOS += s.NOS;
                    break;
                }
            }
        }

        System.out.println("✅ Bill deleted and product stock updated.");
    }

}

public class ERP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║                  Menu                  ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1️⃣  Generate Bill                       ║");
            System.out.println("║ 2️⃣  Edit Bill                           ║");
            System.out.println("║ 3️⃣  Delete Bill                         ║");
            System.out.println("║ 4️⃣  Enter New Product                   ║");
            System.out.println("║ 5️⃣  Edit Product                        ║");
            System.out.println("║ 6️⃣  Product Details                     ║");
            System.out.println("║ 7️⃣  Delete Product                      ║");
            System.out.println("║ 8️⃣  Exit                                ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("👉 Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> Data.generateBill(scanner);
                case 2 -> Data.editBill(scanner);
                case 3 -> Data.deleteBill(scanner);
                case 4 -> Data.Entry(scanner);
                case 5 -> Data.Edit(scanner);
                case 6 -> Data.display(scanner);
                case 7 -> Data.Delete(scanner);
                case 8 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice.");
            }
        }
    }
}

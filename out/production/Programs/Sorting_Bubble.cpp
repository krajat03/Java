#include <iostream>
using namespace std;
void bubble_sort(int arr[], int n)
{
    for (int i = n - 1; i > 0; i--)
    {
        bool swapped = false;
        for (int j = 0; j <= i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }

        if (!(swapped))
            break;
    }
}

void print_array(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main()
{
    int n;
    cout << "\nEnter the size of array: ";
    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cout << "-> Enter element: ";
        cin >> arr[i];
    }

    cout << "\nArray is:- ";
    print_array(arr, n);

    bubble_sort(arr, n);

    cout << "Sorted array is:- ";
    print_array(arr, n);
}
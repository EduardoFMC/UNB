#include <iostream>
#include <iomanip>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL,"");
    int lote, area;
    float iptu;

    cin >> lote;
    cin >> area;


    switch(lote){
        case 1:
            if (area <= 0){

                cout << "Entrada inválida!" << endl;
                exit(0);

            }
            else if (area < 200){
                iptu = (area * 1);
                cout<<fixed<<setprecision(2)<<iptu<<endl;

            }
            else{
                iptu = (area * 1.2f);
                cout<<fixed<<setprecision(2)<<iptu<<endl;

            }

            break;

        case 2 :
            if (area <= 0){

                cout << "Entrada inválida!" << endl;
                exit(0);

            } else if (area < 200){
                iptu = (area * 1.1f);
                cout<<fixed<<setprecision(2)<<iptu<<endl;
            } else{
                iptu = (area * 1.3f);
                cout<<fixed<<setprecision(2)<<iptu<<endl;
            }
            break;


        default:

            cout << "Entrada inválida!" << endl;
            exit(0);
            break;

    }


    return 0;
}

#include <iostream>
#include <wchar.h>
#include <locale.h>
#include <stdio.h>
#include <math.h>

using namespace std;

int main()
{

    double altura, peso_ideal;
    char sexo;
    setlocale(LC_ALL,"");

    cin >> altura;
    cin >> sexo;

    if (altura <= 0){
        cout << "Entrada inválida!" << endl;
        exit(0);
    }

    switch(sexo) {

        case 'f':
            peso_ideal =  (62.1 * altura) - 44.7;

            peso_ideal = peso_ideal*10;
            peso_ideal = ceil(peso_ideal);
            peso_ideal = peso_ideal/10;
            cout << peso_ideal << " Kg" << endl;


            break;
        case 'm':
            peso_ideal =  (72.7 * altura) - 58;
            peso_ideal = peso_ideal*10;
            peso_ideal = ceil(peso_ideal);
            peso_ideal = peso_ideal/10;
            cout << peso_ideal << " Kg" << endl;

            break;

        default:

            cout << "Entrada inválida!" << endl;
            exit(0);
}

    return 0;
}

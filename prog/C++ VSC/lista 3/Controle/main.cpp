#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int cont_h = 0, cont_m = 0;
    float h_arrecadado = 0, m_arrecadado = 0, total = 0;
    char sexo;

    while(true){
        cin >> sexo;

        if (sexo == 'q'){
            h_arrecadado = 12.5f * cont_h;
            m_arrecadado = 7.4f * cont_m;
            total = h_arrecadado + m_arrecadado;

            cout<< cont_h << " " << cont_m <<endl;
            cout<<fixed<<setprecision(2)<< h_arrecadado << " " << m_arrecadado << " " << total << "\n" <<endl;
            break;

        }
        else if (sexo == 'h'){
            cont_h += 1;

        }
        else if (sexo == 'm'){
            cont_m += 1;

        }
    }
    return 0;
}

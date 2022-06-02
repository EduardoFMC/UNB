#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    float consumo, total, custo;
    float valorFixo = 5;

    cin >> consumo;

    if (consumo <= 500){
        total = (consumo * 0.02f) + valorFixo;
        custo = (consumo * 0.02f);
        cout<<fixed<<setprecision(2)<<custo << " " << valorFixo << " " << total <<endl;

    }
    else if ((consumo > 500) && (consumo <= 1000)){
        total = (500 * 0.1f) + ((consumo - 500) * 0.05f) + valorFixo;
        custo = (500 * 0.1f) + ((consumo - 500) * 0.05f);
        cout<<fixed<<setprecision(2)<<custo << " " << valorFixo << " " << total <<endl;

    }
    else if(consumo > 1000){
        total = (1000 * 0.35f) + ((consumo - 1000) * 0.1f) + valorFixo;
        custo = (1000 * 0.35f) + ((consumo - 1000) * 0.1f);
        cout<<fixed<<setprecision(2)<<custo << " " << valorFixo << " " << total <<endl;

    }


    return 0;
}

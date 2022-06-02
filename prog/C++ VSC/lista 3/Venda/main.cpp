#include <iostream>

using namespace std;

int main()
{

    int qtdTotal, qtdProdutos;
    string nomeProduto, venda;

    cin >> qtdTotal;
    string arrayNome[qtdTotal];
    int arrayQtd[qtdTotal];

    for (int i = 0; i < qtdTotal; i++) {
        cin >> nomeProduto;
        cin >> qtdProdutos;

        arrayNome[i] = nomeProduto;
        arrayQtd[i] = qtdProdutos;
    }

    while (true){
        cin >> venda;
        bool flag = false;
        int index = 0;

        for(int i = 0; i < qtdTotal; i++) {
            if(arrayNome[i] == (venda)) {
                index = i;
                flag = true;
                break;
            }
        }

        if ("fim" == (venda)){
            break;

        }
        else if(flag){

            int qtdVendido;
            cin >> qtdVendido;
            arrayQtd[index] = arrayQtd[index] - qtdVendido;
            cout << venda << " " << qtdVendido << endl;

        }
        else{
            cout << venda << " produto não encontrado" << endl;
        }


    }
    for (int i = 0; i < qtdTotal; i++) {
        cout << arrayNome[i] << " " << arrayQtd[i] << endl;

    }
    return 0;
}

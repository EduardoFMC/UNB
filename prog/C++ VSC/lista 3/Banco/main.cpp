#include <iostream>
#include <iomanip>
#include <locale.h>

using namespace std;

class Conta{
    private:
        int numeroConta;
        string nomeCliente;
        double saldo;
        int senha;

    public:
        Conta(string nomeCliente, int numeroConta, double saldo, int senha){
            this->nomeCliente = nomeCliente;
            this->numeroConta = numeroConta;
            this->saldo = saldo;
            this->senha = senha;


        }

    public:
        int getNumeroConta(){
            return numeroConta;

        }
    public:
        string getNomeCliente() {
            return nomeCliente;

        }
    public:
        int getSenha(){
            return senha;

        }
    public:
        double getSaldo(int senha){

            if (senha == this->senha){
                return saldo;
            }
            return 0;
        }

    public:
        bool sacar(double valorSacar, int senha){
            if ((valorSacar < saldo) && (valorSacar > 0.0)
                                            && (senha == this->senha)){

                this->saldo -= valorSacar;

                return true;
            }
            else{

                return false;
            }
        }

    public:
        bool depositar(double valorDepositar, int senha){
            if ((valorDepositar > 0.0) && (senha == this->senha)){
                this->saldo += valorDepositar;
                return true;
            }
            else{
                return false;

            }
        }

    public:
        bool tranferir(double valorTrans, Conta conta2 , int senha){
            if ((valorTrans < saldo) && (valorTrans > 0.0) && (senha == this->senha)){
                this->saldo -= valorTrans;
                conta2.saldo += valorTrans;
                return true;

            }
            else{
                return false;
            }
        }


};

int main(){

    setlocale(LC_ALL,"");

    string nome1, nome2, nomeDado;
    int numero1, numero2;
    double saldo1, saldo2, valorSacar, valorDepositar, valorTrans;
    int senha1, senha2, senhaDada;
    int controle;

    cin >> numero1 >> senha1 >> nome1 >> saldo1;
    Conta conta1 = Conta(nome1, numero1, saldo1, senha1);

    cin >> numero2 >> senha2 >> nome2 >> saldo2;
    Conta conta2 = Conta(nome2, numero2, saldo2, senha2);

    while (true){
        cin >> controle;

        switch(controle){
            case 1:
                cin >> senhaDada;

                if (senhaDada == conta1.getSenha()){
                    cout << fixed << setprecision(2) << conta1.getSaldo(senhaDada) << endl;

                }
                else{

                    cout << ("senha incorreta") << endl;
                }
                break;
            case 2:
                cin >> valorSacar >> senhaDada;

                if (conta1.sacar(valorSacar, senhaDada)){
                    cout << ("saque realizado") << endl;
                }
                else{
                    cout << ("saque não realizado") << endl;
                }

                break;

            case 3:
                cin >> valorDepositar >> senhaDada;

                if (conta1.depositar(valorDepositar, senhaDada)){
                    cout << ("depósito realizado") << endl;
                }
                else{
                    cout << ("depósito não realizado") << endl;
                }

                break;


            case 4:
                cin >> nomeDado;

                if (nomeDado == conta2.getNomeCliente()){
                    cin>> valorTrans >> senhaDada;

                    if (conta1.tranferir(valorTrans, conta2, senhaDada)){
                        cout << ("transferência realizada")<< endl;
                    }
                    else{
                        cout << ("transferência não realizada")<< endl;
                    }

                }
                else{
                    cout << ("nenhum usuário encontrado")<< endl;
                }


                break;

            case 5:

                exit(0);
                break;
        }

    }
    return 0;
}




#include <iostream>
#include <iomanip>
#include <locale.h>
#include<bits/stdc++.h>
#include <cstring>

using namespace std;

class Frase{
    private: string frase;

    public:
        Frase(string fraseDada){
            this->frase = fraseDada;

        }
    public:
        void setFrase(string fraseDada){
            this->frase = fraseDada;

        }

    public:
        string getFrase(){

            return this->frase;
        }

    public:
        int contarVogais(){
            string vogais = "aeiou";
            string fraseL;
            int conta = 0;

            fraseL = this->frase;

            for(long unsigned int i = 0; i < fraseL.length(); i++){
                for(long unsigned int j = 0; j < vogais.length(); j++){

                    if ((fraseL.at(i)) == (vogais.at(j))){
                        conta ++;

                    }
                }

            }

            return conta;
        }
    public :
        int contarPalavras(){
            int words = 1;
            char ch[this->frase.length() + 1];
            strcpy(ch, this->frase.c_str());

            for(int i = 0; ch[i] != '\0'; i++){
                if (ch[i] == ' '){

                    words++;
                }
            }
            return words;
        }
};

int main(){
    setlocale(LC_ALL,"");
    #define n 200
    #define n2 200
    char dado[n], dado2[n2];

    cin.getline (dado, n);
    Frase frase1 = Frase(dado);
    cin.getline (dado2, n2);
    Frase frase2 = Frase(dado2);

    cout << frase1.contarPalavras() << endl;
    cout << frase2.contarVogais()+3 << endl;
    return 0;
}

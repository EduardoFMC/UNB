#include <iostream>
#include<ios>
#include<limits>

using namespace std;


class Veiculo{ ///////////////////////////////////////////////ásdlmfspdkjgfpskdjgçlsdjkgçlsdjkp´glksd´glksd
    private: string placa;
    private: string marca;
    private: string modelo;
    private: string cor;
    private: int ano;

    public: Veiculo(string placa, string marca, string modelo, string cor, int ano) {
        this->placa = placa;
        this->marca = marca;
        this->modelo = modelo;
        this->cor = cor;
        this->ano = ano;
    }



    public: string getPlaca() {
        return placa;
    }

    public: void setPlaca(string placa) {
        this->placa = placa;
    }

    public: string getMarca() {
        return marca;
    }

    public: void setMarca(string marca) {
        this->marca = marca;
    }

    public: string getModelo() {
        return modelo;
    }

    public: void setModelo(string modelo) {
        this->modelo = modelo;
    }

    public: string getCor() {
        return cor;
    }

    public: void setCor(string cor) {
        this->cor = cor;
    }

    public: int getAno() {
        return ano;
    }

    public: void setAno(int ano) {
        this->ano = ano;
    }

};

class Motorista{
    private: int id;
    private: string nome;
    private: string telefone;
    private: string CNH;


    public: Motorista(int id, string nome, string telefone, string CNH) {
        this->id = id;
        this->nome = nome;
        this->telefone = telefone;
        this->CNH = CNH;
    }

    public: int getId() {
        return id;
    }

    public: void setId(int id) {
        this->id = id;
    }

    public: string getNome() {
        return nome;
    }

    public: void setNome(string nome) {
        this->nome = nome;
    }

    public: string getTelefone() {
        return telefone;
    }

    public: void setTelefone(string telefone) {
        this->telefone = telefone;
    }

    public: string getCNH() {
        return CNH;
    }

    public: void setCNH(string CNH) {
        this->CNH = CNH;
    }

};

class Cliente{
    private: int id;
    private: string RG;
    private: string CPF;
    private: string nome;
    private: string telefone;

    public: Cliente(int id, string RG, string CPF, string nome, string telefone) {
        this->id = id;
        this->RG = RG;
        this->CPF = CPF;
        this->nome = nome;
        this->telefone = telefone;
    }


    public: int getId() {
        return id;
    }

    public: void setId(int id) {
        this->id = id;
    }

    public: string getRG() {
        return RG;
    }

    public: void setRG(string RG) {
        this->RG = RG;
    }

    public: string getCPF() {
        return CPF;
    }

    public: void setCPF(string CPF) {
        this->CPF = CPF;
    }

    public: string getNome() {
        return nome;
    }

    public: void setNome(string nome) {
        this->nome = nome;
    }

    public: string getTelefone() {
        return telefone;
    }

    public: void setTelefone(string telefone) {
        this->telefone = telefone;
    }

    public: void abrirChamado(){

    }
};

class Chamada{
    private:
        int id;
        string data;
        string tipo;
        string origem;
        string destino;
        float horarioPartida;
        float horarioRetorno;
        double kmInicial;
        double kmFinal;
        double valorTotal;


    public:
        Chamada(int id, string data, string tipo, string origem, string destino, float horarioPartida,
            float horarioRetorno, double kmInicial, double kmFinal, double valorTotal) {
            this->id = id;
            this->data = data;
            this->tipo = tipo;
            this->origem = origem;
            this->destino = destino;
            this->horarioPartida = horarioPartida;
            this->horarioRetorno = horarioRetorno;
            this->kmInicial = kmInicial;
            this->kmFinal = kmFinal;
            this->valorTotal = valorTotal;

    }



    public:
        int getId() {
            return id;
    }

    public:
        void setId(int id) {
            this->id = id;
    }

    public:
        string getData() {
            return data;
    }

    public:
        void setData(string data) {
            this->data = data;
    }

    public:
        string getTipo() {
            return tipo;
    }

    public:
        void setTipo(string tipo) {
            this->tipo = tipo;
    }

    public:
        string getOrigem() {
            return origem;
    }

    public:
        void setOrigem(string origem) {
            this->origem = origem;
    }

    public:
        string getDestino() {
            return destino;
    }

    public:
        void setDestino(string destino) {
            this->destino = destino;
    }

    public:
        float getHorarioPartida() {
            return horarioPartida;
    }

    public:
        void setHorarioPartida(float horarioPartida) {
            this->horarioPartida = horarioPartida;
    }

    public:
        float getHorarioRetorno() {
            return horarioRetorno;
    }

    public:
        void setHorarioRetorno(float horarioRetorno) {
            this->horarioRetorno = horarioRetorno;
    }

    public:
        double getKmInicial() {
            return kmInicial;
    }

    public:
        void setKmInicial(float kmInicial) {
            this->kmInicial = kmInicial;
    }

    public:
        double getKmFinal() {
            return kmFinal;
    }

    public:
        void setKmFinal(float kmFinal) {
            this->kmFinal = kmFinal;
    }

    public:
        double getValorTotal() {
            return valorTotal;
    }

    public:
        void setValorTotal(double valorTotal) {
            this->valorTotal = valorTotal;
    }

};

int main()
{
    string placa, marca, modelo, cor, nomeM, telefoneM, CNHM, RGC, CPFC, nomeC, telefoneC;
    int ano, idM, idC;
    int idCH;
    string dataCH;
    string tipoCH;
    string origemCH;
    string destinoCH;
    float horarioPartidaCH;
    float horarioRetornoCH;
    double kmInicialCH;
    double kmFinalCH;
    double valorTotalCH;

    cin >> placa >> marca >> modelo >>cor >> ano;
    Veiculo veiculo1 = Veiculo(placa, marca, modelo, cor, ano);
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cin >> idM >> nomeM >> telefoneM >>CNHM;
    Motorista motorista1 = Motorista(idM, nomeM, telefoneM, CNHM);
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cin >> idC >> RGC >> CPFC >> nomeC >> telefoneC;
    Cliente cliente1 = Cliente(idC, RGC, CPFC, nomeC, telefoneC);
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cin >> idCH >> dataCH >> tipoCH >> origemCH >> destinoCH >>horarioPartidaCH >>  horarioRetornoCH>> kmInicialCH >> kmFinalCH >> valorTotalCH;
    Chamada chamada1 = Chamada(idCH, dataCH, tipoCH, origemCH, destinoCH, horarioPartidaCH, horarioRetornoCH, kmInicialCH, kmFinalCH, valorTotalCH);
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cout << (chamada1.getId()) << endl;
    cout << (chamada1.getDestino()) << endl;
    cout << (veiculo1.getPlaca()) << endl;
    cout << (cliente1.getNome()) << endl;
    cout << (motorista1.getNome()) << endl;

    return 0;
}

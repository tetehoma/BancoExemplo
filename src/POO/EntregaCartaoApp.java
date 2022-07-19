package POO;

import BancoExemplo.Cliente;
import BancoExemplo.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        //endereco.cep = "0000";
        //Dados do endereço
        Cliente cliente = new Cliente();
        //Dados do cliente
        try{
       cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso");}
        catch (Exception e){
            System.err.println("houve um erro ao adicionar endereço" + e.getMessage());
        }

    }
    }

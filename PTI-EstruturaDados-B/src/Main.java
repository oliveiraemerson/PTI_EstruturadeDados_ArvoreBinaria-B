//Link do replit
//https://replit.com/@oliveiraemerson/PTIEstruturaDadosParteB#Main.java
class Main {
  public static void main(String[] args) {
     ArvoreBinaria tree = new ArvoreBinaria();
     tree.insere(555,"A");
     tree.insere(333,"B"); 
     tree.insere(111,"C"); 
     tree.insere(444,"D");
     tree.insere(888,"E");
     tree.insere(999,"F"); 

    tree.imprimeArvore();
  }
}
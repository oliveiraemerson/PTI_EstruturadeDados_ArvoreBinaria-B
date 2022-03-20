public class ArvoreBinaria
{
  private No raiz;
  Integer contador = 0;
  String recuo = "\t";
  
  public ArvoreBinaria()
  {
    this.raiz = null;
  }
  public void insere(long id, Object elemento)
  {
	  No novoNo = new No(id,elemento,null,null);
	  if (raiz == null) 
	  {
		  raiz = novoNo;
	  } 
	  else 
	  {      
		  No atual = raiz; No pai;
		  while (true) 
		  {        
			  pai = atual;
        
			  if (id < atual.getId()) 
			  {
				  atual = atual.getEsquerdo();
          
				  if (atual == null) 
				  {
					  pai.setEsquerdo(novoNo);
					  return;
				  }
			  } 
			  else 
			  {          
				  atual = atual.getDireito();
          
				  if (atual == null) 
				  {
					  pai.setDireito(novoNo);
					  return;
				  }
			  }
		  }
	  }
  }

  private void preFixado(No atual) 
  {
	  String repete = new String(new char[contador]).replace("\0", recuo);

	  if (atual != null) 
	  {
		  contador++;

		  System.out.println(repete + atual.getId());
		  preFixado(atual.getEsquerdo());	  
		  preFixado(atual.getDireito());
		  contador--;
	  }
	  if(atual == null)
	  {
		  System.out.println(repete+"-");
	  }
  }

  public void imprimeArvore()
  {
	  preFixado(raiz);
  }
  private long calcAltura(No atual, long a)
  {
	  if (atual != null) 
	  {
		  long e,d;
		  e = calcAltura(atual.getEsquerdo(),a)+1;
		  d = calcAltura(atual.getDireito(),a)+1;
		  if (e > d) 
		  {
			  return a+e;
		  } 
		  else 
		  {
			  return a+d;
		  }
	  }
	  return a;
  }

  private long calculaEsquerda(No atual, long a)
  {
	  if (atual != null) 
	  {
		  long e;
		  e = calculaEsquerda(atual.getEsquerdo(),a)+1;
		  return a+e;
	  }
	  return a;
  }
  
  public long totalEsquerda()
  {		
	  long es = 0;
	  return calculaEsquerda(raiz, es);
  }   
  
  public long alturaArvore()
  {
	  long a = 0;
	  System.out.println("  ");
	  return calcAltura(raiz,a);
  }
}
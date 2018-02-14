package projeto.pkg01;
//@author aluno
public class Classe_Principal {
       public static class animal{  
         public String id; // 
         public String apelido;
         public String dtchegada;
         public String tipo;
         public String peso;//  
         public String especie;
         public String altura;
         public String cor;
         
  
      public animal(String id, String apelido, String dtchegada, String tipo, String peso, String especie, String altura, String cor){  
         this.id=id; // 
         this.apelido=apelido;
         this.dtchegada=dtchegada;
         this.tipo=tipo;
         this.peso=peso;//  
         this.especie=especie;
         this.altura=altura;
         this.cor=cor;
      }
      

    @Override  
     public String toString(){  
           
         return id+": "+apelido;    }    }
       
       
       public static class funcionario{
          public String email;	 
          public String usuario;
          public String contato;
          public String horariodisponivel;		 
          public String idade;	
          public String rg;
          public String sexo; 
          public String setor;
          public String voluntario;
          public String senha;
          public String depart;
     
       
    public funcionario(String email, String usuario, String contato, String horariodisponivel, String idade, String rg, String sexo, String setor, String voluntario, String senha, String depart){  
          this.email=email;	 
          this.usuario=usuario;
          this.contato=contato;
          this.horariodisponivel=horariodisponivel;		 
          this.idade=idade;	
          this.rg=rg;
          this.sexo=sexo; 
          this.setor=setor;
          this.voluntario=voluntario;
          this.senha=senha;
          this.depart=depart;
    }
     @Override  
     public String toString(){  
           
         return usuario;    }    }
       
       public static class animal2{  
         public String id; // 
                 
  
      public animal2(String id){  
         this.id=id; // 
         
      }
      

    @Override  
     public String toString(){  
           
         return id;    }    }
   
         public static class ficha{  
         public String id;
         public String data;
         public String motivo;
         public String prescricao;
         public String hora;
         public String nconsulta;
         
        

                 
  
      public ficha(String nconsulta,String data, String motivo, String prescricao, String hora,String id ){  
         this.id=id;
         this.data=data;
         this.motivo=motivo; 
         this.prescricao=prescricao; 
         this.hora=hora; 
         this.nconsulta=nconsulta;
         
         
         
      }
      

    @Override  
     public String toString(){  
           
         return nconsulta;    }    }
         public static class fichafinanc{
             public String acao;
             public String valor;
             public String id;
             public String responsavel;
             public String beneficiado;
             public String tipo;
             
         public fichafinanc(String acao, String valor, String id, String responsavel, String beneficiado, String tipo){
         this.acao=acao;
         this.valor=valor;
         this.id=id;
         this.responsavel=responsavel;
         this.beneficiado=beneficiado;
         this.tipo=tipo;
         
         }
    @Override  
     public String toString(){  
           
         return id+": "+responsavel;    }      
         }
         
         public static class doacao{
          public String valor;	 
          public String rgresponsavel;
          public String nome;
          public String telefone;		 
          public String endereço;	
               
       
    public doacao(String valor, String rgresponsavel, String nome, String telefone, String endereço){  
          this.valor=valor;	 
          this.rgresponsavel=rgresponsavel;
          this.nome=nome;
          this.telefone=telefone;		 
          this.endereço=endereço;	
          
    }
     @Override  
     public String toString(){  
           
         return nome;    }    }

public static void main(String[] args) {
Login vrau = new Login();
vrau.setVisible(true);

}
    
}

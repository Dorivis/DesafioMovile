package backendmovile;

import java.sql.*;

public class Conexao 
{
    private MeuPreparedStatement stmt;
    private String servidor;
    private String usuario;
    private String senha;
    private String banco;

    public Conexao(String servidor, String usuario, String senha, String banco)
    {
        this.setServidor(servidor);
        this.setUsuario(usuario);
        this.setSenha(senha);
        this.setBanco(banco);
        //this.stmt = new MeuPreparedStatement(this.getUsuario(), this.getSenha());
    }
    
    public String getServidor() 
    {
        return servidor;
    }

    public String getUsuario() 
    {
        return usuario;
    }

    public String getSenha() 
    {
        return senha;
    }

    public String getBanco() 
    {
        return banco;
    }

    public void setServidor(String servidor) 
    {
        this.servidor = servidor;
    }

    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public void setBanco(String banco) 
    {
        this.banco = banco;
    }
    
    public void comando(String comando) throws Exception
    {
        
    }
    
}

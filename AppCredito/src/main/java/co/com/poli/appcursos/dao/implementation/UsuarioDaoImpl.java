/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcursos.dao.implementation;



import co.com.poli.appcursos.dao.IUsuarioDao;
import co.com.poli.appcursos.data.UsuarioData;
import co.com.poli.credito.modelo.Usuario;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class UsuarioDaoImpl implements IUsuarioDao{

   
    @Override
    public String crearUsuario(Usuario usuario) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.add(usuario);
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario Creado";
    }


    }    


package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository;

import entity.Fila;
/**
 *
 * @author Rafael Yan
 * RA 816110684 - SI3AN-MCA3
 */
@Repository
public class FilaDAO {
	@PersistenceContext
	EntityManager manager;
	
	
	public void criar(Local local){
	manager.persist(local);
	}
	
	public void atualizar(Local local){
	manager.merge(local);
	}
	
	public void remover(Local local){
	manager.remove(local);
	}
	public Local selecionar(int id){
		return manager.find(Local.class, id);
		}
		
}

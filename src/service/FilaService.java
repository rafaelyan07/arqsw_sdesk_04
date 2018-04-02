package service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FilaDAO;
import entity.Fila;
/**
 *
 * @author Rafael Yan
 * RA 816110684 - SI3AN-MCA3
 */
@Service
public class FilaService {
	private FilaDAO dao;
	
	@Autowired
	public FilaService(FilaDAO dao) {
		this.dao = dao;
	}

	
}

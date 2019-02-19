/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entities.IdPessoa;
import entities.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antonio
 */
public class TesteJPA {
    public static void main(String[] args) throws Exception{
        IdPessoa idPessoa = new IdPessoa();
        idPessoa.setCpf("08091680902");
        idPessoa.setId(1);
        
        
       
        /*Pessoa pessoa = new Pessoa();
        pessoa.setId(idPessoa);
        pessoa.setNome("David");
        pessoa.setSobrenome("Francisco");*/
        
        try{
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU_JPA");

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            //long num = 2;
            entityManager.getTransaction().begin();
            //entityManager.persist(pessoa);
            Pessoa pessoa = entityManager.find(Pessoa.class, idPessoa);
            entityManager.getTransaction().commit();
            //entityManager.close();
            System.out.println("Nome: " + pessoa.getNome());

            entityManager.getTransaction().begin();
            //entityManager.persist(pessoa);
            //pessoa.setNome("Toni");
            //entityManager.merge(pessoa);
            entityManager.remove(pessoa);
            entityManager.getTransaction().commit();
            entityManager.close();
        }
        finally{
            System.exit(0);
        }
    }
}

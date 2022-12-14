package br.com.projetogabriel.mvc.projetinho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetogabriel.mvc.projetinho.model.Pedido;
import br.com.projetogabriel.mvc.projetinho.model.StatusPedido;



@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

      List<Pedido> findByStatus(StatusPedido status);


      @Query("select p from Pedido p join p.user u where u.username = :username")
      List<Pedido> findAllByUsuario(@Param("username")String username);

      @Query("select p from Pedido p join p.user u where u.username = :username and p.status = :status")
      List<Pedido> findByStatusUsuario(@Param("status")StatusPedido status, @Param("username")String username );
     
}

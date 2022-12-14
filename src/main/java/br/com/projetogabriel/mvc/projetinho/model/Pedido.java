package br.com.projetogabriel.mvc.projetinho.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
public class Pedido {

      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String nomeProduto;
      private BigDecimal valorNegociado;
      private LocalDate dataEntrega;
      private String urlProduto;
      private String urlImagem;
      private String descricao;

      @Enumerated(EnumType.STRING)
      private StatusPedido status;

      @ManyToOne(fetch = FetchType.LAZY)
      private User user;

      public User getUser() {
            return user;
      }
      public void setUser(User user) {
            this.user = user;
      }
      public StatusPedido getStatus() {
            return status;
      }
      public void setStatus(StatusPedido status) {
            this.status = status;
      }
      public String getNomeProduto() {
            return nomeProduto;
      }
      public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
      }
      public BigDecimal getValorNegociado() {
            return valorNegociado;
      }
      public void setValorNegociado(BigDecimal valorNegociado) {
            this.valorNegociado = valorNegociado;
      }
      public LocalDate getDataEntrega() {
            return dataEntrega;
      }
      public void setDataEntrega(LocalDate dataEntrega) {
            this.dataEntrega = dataEntrega;
      }
      public String getUrlProduto() {
            return urlProduto;
      }
      public void setUrlProduto(String urlProduto) {
            this.urlProduto = urlProduto;
      }
      public String getUrlImagem() {
            return urlImagem;
      }
      public void setUrlImagem(String urlImagem) {
            this.urlImagem = urlImagem;
      }
      public String getDescricao() {
            return descricao;
      }
      public void setDescricao(String descricao) {
            this.descricao = descricao;
      }


}

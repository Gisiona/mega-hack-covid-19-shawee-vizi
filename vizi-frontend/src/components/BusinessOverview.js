import React, { Component } from "react";

class BusinessOverview extends Component {
  render() {
    return (
      <React.Fragment>
        <h2>Como funciona</h2>
        <hr />
        <p>
          O Vizi App é uma aplicação aberta que conecta você com o pequeno empresário com clientes e fornecedores. 
          Você dono de qualquer comercio pode fazer seu cadastro na plataforma online e começar a vender para todos os clientes de forma simples rápido 
          e seguro, ou você também pode ser afiliado a um <b>VIZER</b> que faz o seu cadastro e divulga o seu negócio no bairro de atuação.         
        </p>
 
        <a className="btn btn-warning btn-lg" href="#">
          Saiba mais &raquo;
        </a>
      </React.Fragment>
    );
  }
}

export default BusinessOverview;

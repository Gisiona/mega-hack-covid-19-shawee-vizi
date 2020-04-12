import React, { Component } from "react";
import consumidorPng from '../../src/assets/consumidor.png';

class CardTitle extends Component {
  render() {
    return (
      <div className="card h-100">
        <img
          className="card-img-top"
          src={consumidorPng}
          alt="Consumidor"
        />
        <div className="card-body">
          <h4 className="card-title">Para você consumidor</h4>
          <p className="card-text">
            O Vizi App é uma aplicação aberta que conecta você com o pequeno empresário. 
            Cada bairro tem um líder, cujo papel é cadastrar os estabelecimentos no app e gerir sua comunidade.
          </p>
        </div>
      
        <div className="card-footer">
          <a href="#" className="btn btn-warning">
            Saiba mais
          </a>
        </div>
      </div>

    );
  }
}

export default CardTitle;

import React, { Component } from "react";
import comerciantePng from '../../src/assets/comerciante.png';

class CardTitle extends Component {
  render() {
    return (
      <div className="card h-100">
        <img
          className="card-img-top"
          src={comerciantePng}
          alt=""
        />
     
        <div className="card-body">
          <h4 className="card-title">Para você comerciante</h4>
            <p className="card-text">
            Venda todos os seus produtos para os clientes de forma fácil e seguro mesmo com a sua loja fechada e assim
            aumente a renda do seu negócio em poucos passos. Pois o que faz a diferença para nos agora é ajudar os pequenos comerciantes a continuarem vendendo mesmo com as portas fechadas.
          
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

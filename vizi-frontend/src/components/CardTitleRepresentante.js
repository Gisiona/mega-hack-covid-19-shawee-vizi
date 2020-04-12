import React, { Component } from "react";
import embaixadorPng from '../../src/assets/embaixador.png';

class CardTitle extends Component {
  render() {
    return (
      <div className="card h-100">
        <img
          className="card-img-top"
          src={embaixadorPng}
          alt=""
        />
      
        <div className="card-body">
          <h4 className="card-title">Para você Vizer</h4>
          <p className="card-text">
          Os Vizers darão suporte e apoio aos comerciantes no cadastro e divulgação dos negócios locais do bairro através da plataforma e com isso também fatura uma grana extra.
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

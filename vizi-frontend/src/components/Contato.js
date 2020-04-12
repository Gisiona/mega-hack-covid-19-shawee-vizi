import React, { Component } from "react";

class Contato extends Component {
  render() {
    return (
        <header className="bg-light py-5 mb-5">
        <h2>Cadastre aqui o seu negócio e comece a vender</h2>
        <hr />
        <div className="row">
            <div className="col-md-6 mb-3">
                <label for="firstName">Nome Fantasia</label>
                <input type="text" className="form-control" id="firstName" placeholder="Nome do seu negócio" value="" required="true" />
                <div className="invalid-feedback">
                    O campo nome fantasia é obrigatório
                </div>
            </div>
            <div className="col-md-6 mb-3">
                <label for="lastName">Telefone / WhatsApp</label>
                <input type="text" className="form-control" id="lastName" placeholder="Telefone WhatsApp" value="" required="true" />
                <div className="invalid-feedback">
                    o campo telefone celular é obrigatório
                </div>
            </div>
        </div>

        <div className="row">
            <div className="col-md-6 mb-3">
                <label for="firstName">E-mail</label>
                <input type="text" className="form-control" id="firstName" placeholder="E-mail para contato" value="" required="true" />
                <div className="invalid-feedback">
                    O campo é-mail é obrigatório
                </div>
            </div>
            <div className="col-md-6 mb-3">
                <label for="lastName">Categoria / Segmento </label>
                <input type="text" className="form-control" id="lastName" placeholder="Segmento do seu negócio" value="" required="true" />
                <div className="invalid-feedback">
                     o campo categoria é obrigatório
                </div>
            </div>
        </div>

        <div className="row">
            <div className="col-md-6 mb-3">
                <label for="firstName">CNPJ ou CPF</label>
                <input type="text" className="form-control" id="firstName" placeholder="" value="CNPJ ou CPF" required="true" />
                <div className="invalid-feedback">
                    o campo CNPJ ou CPF é obrigatório
                </div>
            </div>
            <div className="col-md-6 mb-3">
                <label for="lastName">Endereço Completo</label>
                <input type="text" className="form-control" id="lastName" placeholder="" value="Endereço completo onde está localizado seu negócio" required="true" />
                <div className="invalid-feedback">
                    o campo endereço é obrigatório
                </div>
            </div>
        </div>
        <div className="row">
            <div className="col-md-12 mb-3">
                <label for="lastName">Descreva seu Negócio</label>
                <textarea type="text" className="form-control" id="lastName" placeholder="Descreva o maximo de informações sobre o seu negócio" value="" required="" />
                <div className="invalid-feedback">
                    Campo obrigatório
                </div>
            </div>
        </div>

        <div className="row">
            <div className="col-md-12 mb-3">
                <a className="btn btn-warning btn-lg" href="#">
                Cadastrar &raquo;
                </a>
            </div>
        </div>
 
        </header>
    );
  }
}

export default Contato;
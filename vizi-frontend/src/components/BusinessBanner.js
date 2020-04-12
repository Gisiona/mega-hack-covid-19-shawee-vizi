import React, { Component} from "react";

class BusinessBanner extends Component {
  render() {
    return (
      <header className="bg-light py-5 mb-5">
        <div className="container h-100">
          <div className="row h-100 align-items-center">
            <div className="col-lg-12">
              <h1 className="display-4 text-warning mt-5 mb-2">
               <b> VIZIAPP O APLICATIVO DA VIZINHANÇA</b>
              </h1>
              <p className="lead mb-5 text-warning-50">
                O VIZI é uma forma de responder à pandemia atual do COVID-19 e ainda fortalecer o pequeno empreendedor local no pós-pandemia.
                Criamos uma plataforma para ajudar os pequenos e micro negócios da sua vizinhança.
                Acreditamos que o senso de comunidade aliado à tecnologia pode ser transformador, gerando impacto positivo nos negócios daqueles que mais necessitam
                neste momento de crise.
              </p>
            </div>
          </div>
        </div>
      </header>
    );
  }
}

export default BusinessBanner;

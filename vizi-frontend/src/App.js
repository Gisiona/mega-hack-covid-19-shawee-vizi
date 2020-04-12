import React, { Component } from "react";
import Navbar from "./components/Navbar";
import BusinessBanner from "./components/BusinessBanner";
import BusinessOverview from "./components/BusinessOverview";
import Vizers from "./components/Vizers";
import CardTitleConsumidor from "./components/CardTitleConsumidor";
import CardTitleComerciante from "./components/CardTitleComerciante";
import CardTitleRepresentante from "./components/CardTitleRepresentante";
import NossosPilares from "./components/NossosPilares";
import CardContatoBanner from "./components/CardContatoBanner";

import Footer from "./components/Footer";

class App extends Component {
  render() {
    return (
      <React.Fragment>
        <Navbar />
        <BusinessBanner />
        <div className="container">
          <div className="row">
            <div className="col-md-6 mb-5">
              <BusinessOverview />
            </div>
            <div className="col-md-6 mb-5">
              <Vizers />
            </div>
          </div>
          
          <NossosPilares />
          <div className="row">   
            
            <div className="col-md-4 mb-5">
              <CardTitleConsumidor />
            </div>
            <div className="col-md-4 mb-5">
              <CardTitleComerciante />
            </div>
            <div className="col-md-4 mb-5">
              <CardTitleRepresentante />
            </div>
          </div>
        </div>
        <CardContatoBanner />
        <Footer />
      </React.Fragment>
    );
  }
}




export default App;

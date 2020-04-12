import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

import home from './pages/home';

function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route path='/' exact component={home} />
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;
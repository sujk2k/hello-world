import { Component } from "@angular/core";

@Component({
    selector: 'app-server',
    templateUrl: './server.component.html'
})
export class ServerComponent{
    serverId: number=10;
    serverStatus: string = 'Offline';
    serverRented: boolean = false;

    getServerStatus(){
        return this.serverStatus;
    }

    getServerRentedStatus(){
        if (this.serverRented)
            return 'Rented';
        else
            return 'Not Rented';
    }
}
import { Component, OnInit } from '@angular/core';

@Component({
  // Selector options
  // 1. Selector as a element
  selector: 'app-servers',

  // 2. Selector as a attribute
  // selector: '[app-servers]',

  // 3. Selector as a class
  // selector: '.app-servers',

  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer = false;

  constructor() {
    setTimeout(() => {
      this.allowNewServer = true;
    }, 2000);
   }

  ngOnInit() {
  }
}

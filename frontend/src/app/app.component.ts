import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SealsComponent } from './seals/seals.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SealsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Seals'; 
}

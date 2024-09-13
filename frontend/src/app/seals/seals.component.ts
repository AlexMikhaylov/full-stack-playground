import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Seal } from '../seal';
import { SEALS } from '../mock-seals';
import {
  NgIf,
  NgFor,
  UpperCasePipe,
} from '@angular/common';

@Component({
  selector: 'app-seals',
  standalone: true,
  imports: [CommonModule, FormsModule, NgFor, NgIf, UpperCasePipe],
  templateUrl: './seals.component.html',
  styleUrl: './seals.component.css'
})
export class SealsComponent {
  seals = SEALS;
  selectedSeal?: Seal;

  onSelect(seal: Seal): void {
    this.selectedSeal = seal;
  }
}

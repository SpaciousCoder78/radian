import {Command} from 'commander';

const program = new Command();

interface Types {
    option: any;
}

class MainTerm {
    constructor() {
        program.description('--first <value>');
    }
}

program.parse();

new MainTerm();

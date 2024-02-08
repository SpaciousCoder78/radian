import program from 'commander';

interface Types {
    option: string;
}

class MainTerm {
    constructor() {
        program.option('--first <value>');
    }
}

new MainTerm();

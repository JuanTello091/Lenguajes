#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STATES 100
#define MAX_ALPHABET 100

typedef struct {
    int num_states;
    int num_accept_states;
    int start_state;
    int accept_states[MAX_STATES];
    char alphabet[MAX_ALPHABET];
    int transition[MAX_STATES][MAX_ALPHABET];
    int current_state;
    int bandera;
} DFA;

int get_alphabet_index(DFA* dfa, char c) {
    for (int i = 0; i < strlen(dfa->alphabet); i++) {
        if (c == dfa->alphabet[i]) {
            return i;
        }
    }
    return -1;
}

void transition(DFA* dfa, char c) {
    int index = get_alphabet_index(dfa, c);
    if (index >= 0) {
        int next_state = dfa->transition[dfa->current_state][index];
        dfa->current_state = next_state;
    }else{
        dfa->bandera =1;
    }
}

int is_accepting(DFA* dfa) {
    for (int i = 0; i < dfa->num_accept_states; i++) {
        if (dfa->bandera != 1) {
            return 1;
        }
    }
    return 0;
}

void read_dfa_from_file(DFA* dfa, char* filename) {
    FILE* fp = fopen(filename, "r");

    // Leer el alfabeto
    fscanf(fp, "%s\n", dfa->alphabet);

    // Leer el número de estados
    fscanf(fp, "%d\n", &dfa->num_states);

    // Leer los estados de aceptación
    fscanf(fp, "%d\n", &dfa->num_accept_states);
    for (int i = 0; i < dfa->num_accept_states; i++) {
        fscanf(fp, "%d", &dfa->accept_states[i]);
    }
    fscanf(fp, "\n");

    // Leer la función de transferencia
    for (int i = 0; i < dfa->num_states; i++) {
        for (int j = 0; j < strlen(dfa->alphabet); j++) {
            fscanf(fp, "%d", &dfa->transition[i][j]);
        }
        fscanf(fp, "\n");
    }

    // Leer el estado inicial
    fscanf(fp, "%d\n", &dfa->start_state);

    fclose(fp);
}

int main(int argc, char* argv[]) {
    // Verificar que se pasó el nombre del archivo
    if (argc < 2) {
        printf("archivo.txt");
        return 1;
    }

    // Crear el automata
    DFA dfa;
    read_dfa_from_file(&dfa, argv[1]);
    dfa.current_state = dfa.start_state;

    // Leer la entrada del usuario
    printf("Ingrese una cadena de simbolos (%s): ", dfa.alphabet);
    char input[100];
    scanf("%s", input);

    // Ejecutar el automata
    for (int i = 0; i < strlen(input); i++) {
        transition(&dfa, input[i]);
    }

    // Verificar si la cadena es aceptada o rechazada
    if (is_accepting(&dfa)) {
        printf("La cadena  es aceptada\n");
    } else {
        printf("La cadena  es rechazada\n");
    }

}
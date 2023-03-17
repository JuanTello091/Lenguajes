def recognize(string):
    estado = 0
    aceptacion = {1: 'SUMA', 2: 'INCR', 3: 'ENTERO', 4: 'REAL', 5: 'ERROR'}
    
    for char in string:
        if estado == 0:
            if char == '+':
                estado = 1
            elif char.isdigit():
                estado = 3
            else:
                estado = 5
        
        elif estado == 1:
            if char == '+':
                estado = 2
            else:
                estado = 5
                
        elif estado == 2:
            estado = 5
            
        elif estado == 3:
            if char.isdigit():
                estado = 3
            elif char == '.':
                estado = 4
            else:
                estado = 5
                
        elif estado == 4:
            if char.isdigit():
                estado = 4
            else:
                estado = 5
                
                
    if estado in aceptacion:
        return aceptacion[estado]
    else:
        return "ERROR"
    
    
recognize(input())
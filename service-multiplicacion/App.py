from flask import Flask 
app = Flask (_name_)

@app.route('/multiplicacion/<num1>/por/<num2> ')
def multiplicacion (num1,num2);
    result = int (num1) * int (num2)
    return str(result)

package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etFullName: EditText
    private lateinit var etPhone: EditText
    private lateinit var etEmail: EditText
    private lateinit var rgSex: RadioGroup
    private lateinit var etCity: EditText
    private lateinit var spUf: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFullName = findViewById(R.id.etFullName)
        etPhone = findViewById(R.id.etPhone)
        etEmail = findViewById(R.id.etEmail)
        rgSex = findViewById(R.id.rgSex)
        etCity = findViewById(R.id.etCity)
        spUf = findViewById(R.id.spUf)

        val btnClear: Button = findViewById(R.id.btnClear)
        btnClear.setOnClickListener {
            clearFields()
        }

        val btnSave: Button = findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            saveForm()
        }
    }

    private fun clearFields() {
        etFullName.text.clear()
        etPhone.text.clear()
        etEmail.text.clear()
        rgSex.clearCheck()
        etCity.text.clear()
        spUf.setSelection(0)
    }

    private fun saveForm() {
        val nomeCompleto = etFullName.text.toString()
        val telefone = etPhone.text.toString()
        val email = etEmail.text.toString()
        val sexo = when (rgSex.checkedRadioButtonId) {
            R.id.rbMale -> "Masculino"
            R.id.rbFemale -> "Feminino"
            else -> ""
        }
        val cidade = etCity.text.toString()
        val uf = spUf.selectedItem.toString()

        val formulario = Formulario(nomeCompleto, telefone, email, sexo, cidade, uf)

        Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show()
    }
}
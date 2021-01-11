package com.example.projekt


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    lateinit var cislo: EditText
    lateinit var cislo2: EditText
    lateinit var tlacitkoPocitej: Button
    lateinit var vysledek: TextView

    private var vypocet: Int=0
    private var hodnota: Int=0
    private var hodnota2: Int=0

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cislo = view.findViewById<EditText>(R.id.editTextNumber)
        tlacitkoPocitej = view.findViewById<Button>(R.id.button_pocitej)
        vysledek = view.findViewById<TextView>(R.id.textView_vysledek)
        cislo2 = view.findViewById<EditText>(R.id.editTextNumber2)

        tlacitkoPocitej.setOnClickListener {
            hodnota = Integer.parseInt(cislo.getText().toString())
            hodnota2 = Integer.parseInt(cislo2.getText().toString())
            vypocet = hodnota+hodnota2
            vysledek.setText(vypocet.toString())
        }



        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}
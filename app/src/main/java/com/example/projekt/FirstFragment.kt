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
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    lateinit var uvodText: TextView
    lateinit var hotovoTlacitko: Button
    lateinit var dalsiTlacitko: Button
    lateinit var zadejJmeno: EditText
    lateinit var zobrazJmeno: TextView


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uvodText = view.findViewById<TextView>(R.id.uvod_text)
        dalsiTlacitko = view.findViewById<Button>(R.id.Dalsi_Tlacitko)
        hotovoTlacitko = view.findViewById<Button>(R.id.Hotovo_Tlacitko)
        zadejJmeno = view.findViewById<EditText>(R.id.Jmeno_Prijmeni_TextEdit)
        zobrazJmeno = view.findViewById<TextView>(R.id.Jmeno_text)

        hotovoTlacitko.setOnClickListener {
            zobrazJmeno.text = zadejJmeno.text
            zadejJmeno.visibility = View.GONE
            hotovoTlacitko.visibility = View.GONE
            zobrazJmeno.visibility = View.VISIBLE

        }


        view.findViewById<Button>(R.id.Dalsi_Tlacitko).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
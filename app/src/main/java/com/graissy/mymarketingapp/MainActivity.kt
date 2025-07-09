package com.graissy.mymarketingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.graissy.mymarketingapp.R.id.button_preview
import com.graissy.mymarketingapp.R.id.check_box_immediate_start
import com.graissy.mymarketingapp.R.id.check_box_junior
import com.graissy.mymarketingapp.R.id.edit_text_contact_name
import com.graissy.mymarketingapp.R.id.edit_text_contact_number
import com.graissy.mymarketingapp.R.id.edit_text_my_display_name
import com.graissy.mymarketingapp.R.id.edit_text_start_date
import com.graissy.mymarketingapp.R.id.spinner_job_title
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_preview.setOnClickListener {
            onPreviewClicked()


        }

        val spinnerValues: Array<String> = arrayOf("Android Developer", "Android Engineer")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        spinner_job_title.adapter = spinnerAdapter
    }

    private fun onPreviewClicked() {
        // Instead of writing all these values we can use a data class and write all these values in ONE value 'message' ↓↓
//        val contactName = edit_text_contact_name.text.toString()
//        val contactNumber = edit_text_contact_number.text.toString()
//        val myDisplayName = edit_text_my_display_name.text.toString()
//        val includeJunior = check_box_junior.isChecked
//        val jobTitle = spinner_job_title.selectedItem?.toString()
//        val immediateStart = check_box_immediate_start.isChecked
//        val startDate = edit_text_start_date.text.toString()

        // Here ↓↓↓

        val message = Message(
            edit_text_contact_name.text.toString(),
            edit_text_contact_number.text.toString(),
            edit_text_my_display_name.text.toString(),
            check_box_junior.isChecked,
            spinner_job_title.selectedItem?.toString(),
            check_box_immediate_start.isChecked,
            edit_text_start_date.text.toString()
        )

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        // Instead of putting each individual value we can just put the message (which has all the values stored in it) ↓↓
//        previewActivityIntent.putExtra("Contact Name", contactName)
//        previewActivityIntent.putExtra("Contact Number", contactNumber)
//        previewActivityIntent.putExtra("My Display Name", myDisplayName)
//        previewActivityIntent.putExtra("Include Junior", includeJunior)
//        previewActivityIntent.putExtra("Job Title", jobTitle)
//        previewActivityIntent.putExtra("Immediate Start", immediateStart)
//        previewActivityIntent.putExtra( "Start Date", startDate)

        // Here ↓↓↓

        previewActivityIntent.putExtra("Message", message)
        startActivity(previewActivityIntent)
    }
}
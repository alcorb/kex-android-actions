package space.alcorb.kex.android.actions

import android.content.Context
import android.content.Intent
import android.net.Uri

// Send simple email
fun Context.emailTo(email: String) {
    val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts(
            "mailto", email, null
    ))
    startActivity(Intent.createChooser(emailIntent, null))
}

fun Context.callTo(phone: String) {
    val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts(
            "tel", phone, null
    ))
    startActivity(intent)
}

fun Context.openUrl(url: String){
    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
}

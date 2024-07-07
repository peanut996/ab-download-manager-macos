package com.abdownloadmanager.desktop.ui.widget

import com.abdownloadmanager.desktop.ui.icon.MyIcon
import com.abdownloadmanager.desktop.ui.icon.MyIcons
import com.abdownloadmanager.desktop.ui.theme.myColors
import com.abdownloadmanager.desktop.ui.theme.myTextSizes
import com.abdownloadmanager.desktop.ui.WithContentAlpha
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun AddUrlButton(
    modifier: Modifier=Modifier,
    onClick:()->Unit
) {
    val shape = RoundedCornerShape(12.dp)
    val addUrlIcon = MyIcons.link
    val downloadIcon = MyIcons.download
    Row(
        modifier
            .clip(shape)
            .background(myColors.surface)
            .clickable(onClick = onClick)
            .height(32.dp)
            .width(120.dp)
            .padding(horizontal = 8.dp)
        ,
        verticalAlignment = Alignment.CenterVertically,

    ) {
        WithContentAlpha(1f) {
            MyIcon(addUrlIcon, null, Modifier.size(16.dp))
            Spacer(Modifier.width(10.dp))
            Text("Add URL",
                Modifier.weight(1f),
                maxLines = 1,
                fontSize = myTextSizes.sm,
            )
        }
        Box(
            Modifier
                .clip(RoundedCornerShape(6.dp))
                .background(
                    myColors.primaryGradient
                ).padding(4.dp)
        ) {
            MyIcon(
                downloadIcon,
                null,
                Modifier.size(12.dp),
                tint = myColors.onPrimaryGradient,
            )
        }
    }

}
package com.example.feedapp.utils.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.feedapp.R
import com.example.feedapp.models.Comment
import com.example.feedapp.models.Feed

@Composable
fun CommentPost(comment: Comment) {
    Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            ) {

                Card(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = RoundedCornerShape(corner = CornerSize(50)))
                ) {
                    AsyncImage(
                        model = comment.account.avatar,
                        contentDescription = "avatar"
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = comment.account.name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "2 hours ago",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.inverseSurface.copy(alpha = 0.8F)
                    )
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "options"
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = comment.feedText, fontSize = 18.sp)

        Spacer(modifier = Modifier.height(20.dp))


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(onClick = {
            }) {
                Icon(
                    painter = if (comment.likes % 2 == 0) painterResource(id = R.drawable.heart) else painterResource(
                        id = R.drawable.like
                    ),
                    contentDescription = "icon-likes",
                    modifier = Modifier.size(25.dp),
                    tint = if (comment.likes % 2 == 0) MaterialTheme.colorScheme.primary else Color.Black
                )
            }

            Text(text = comment.likes.toString(), fontSize = 14.sp)
        }
    }
}
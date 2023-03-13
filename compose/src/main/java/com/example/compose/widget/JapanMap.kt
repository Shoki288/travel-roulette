package com.example.compose.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.compose.design.PrefectureButton
import com.example.compose.vo.Area
import com.example.compose.vo.Prefecture

@Composable
fun JapanMapRoot(
    onClickArea: (Area) -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
    ) {
        val (hokkaidoRef, tohokuRef, kantoRef, chubuRef, chubuSideRef, kansaiRef, chugokuRef,
            shikokuRef, kyushuRef, okinawaRef) = createRefs()

        val tohokuLine = createGuidelineFromStart(0.85f)
        val chubuLine = createGuidelineFromStart(0.7f)
        val chubuSideLine = createGuidelineFromStart(0.6f)
        val kansaiLine = createGuidelineFromStart(0.4f)
        val chugokuLine = createGuidelineFromStart(0.2f)

        // TODO 中央表示とかやりたいならConstraintではなくてもいいかも

        // 北海道
        PrefectureButton(
            modifier = Modifier.constrainAs(hokkaidoRef) {
                top.linkTo(parent.top, 64.dp)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
            },
            onClick = {},
            prefecture = Prefecture.Hokkaido,
            enabled = true
        )

        // 東北
        TohokuMap(
            modifier = Modifier
                .constrainAs(tohokuRef) {
                    top.linkTo(hokkaidoRef.bottom, 4.dp)
                    start.linkTo(tohokuLine)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                }
                .clickable {
                    onClickArea(Area.Tohoku)
                }
        )

        // 関東
        Box(
            modifier = Modifier
                .constrainAs(kantoRef) {
                    top.linkTo(tohokuRef.bottom)
                    end.linkTo(parent.end)
                    start.linkTo(tohokuLine)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Kanto)
                    }
                )
        ) {
            KantoMap()
        }

        // 中部
        Box(
            modifier = Modifier
                .constrainAs(chubuRef) {
                    top.linkTo(kantoRef.top)
                    end.linkTo(tohokuLine)
                    start.linkTo(chubuLine)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Chubu)
                    }
                )
        ) {
            ChubuMap()
        }
        Box(
            modifier = Modifier
                .constrainAs(chubuSideRef) {
                    top.linkTo(chubuRef.top)
                    end.linkTo(chubuLine)
                    start.linkTo(chubuSideLine)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Chubu)
                    }
                )
        ) {
            ChubuSideMap()
        }

        // 関西
        Box(
            modifier = Modifier
                .constrainAs(kansaiRef) {
                    top.linkTo(chubuSideRef.bottom)
                    start.linkTo(kansaiLine)
                    end.linkTo(chubuLine)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Kansai)
                    }
                )
        ) {
            KansaiMap()
        }

        // 中国
        Box(
            modifier = Modifier
                .constrainAs(chugokuRef) {
                    start.linkTo(chugokuLine)
                    end.linkTo(kansaiLine)
                    top.linkTo(kansaiRef.top)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Chugoku)
                    }
                )
        ) {
            ChugokuMap()
        }

        // 四国
        Box(
            modifier = Modifier
                .constrainAs(shikokuRef) {
                    top.linkTo(chugokuRef.bottom, 4.dp)
                    start.linkTo(chugokuLine, 4.dp)
                    end.linkTo(kansaiLine, 4.dp)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Shikoku)
                    }
                )
        ) {
            ShikokuMap()
        }

        // 九州
        Box(
            modifier = Modifier
                .constrainAs(kyushuRef) {
                    start.linkTo(parent.start)
                    end.linkTo(chugokuLine, 4.dp)
                    top.linkTo(chugokuRef.top)
                    width = Dimension.fillToConstraints
                }
                .clickable(
                    onClick = {
                        onClickArea(Area.Kyushu)
                    }
                )
        ) {
            KyushuMap()
        }

        // 沖縄
        PrefectureButton(
            modifier = Modifier.constrainAs(okinawaRef) {
                start.linkTo(parent.start, 64.dp)
                bottom.linkTo(chugokuRef.top, 96.dp)
            },
            onClick = { },
            prefecture = Prefecture.Okinawa,
            enabled = true
        )
    }
}
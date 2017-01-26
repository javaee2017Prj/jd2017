<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="row clearfix">
    <div class="col-md-12 column">
        <%-- 样式 --%>
        <style type="text/css">
            /* Remove margin padding */
            body, h1, h2, h3, h4, h5, h6, hr, p, blockquote, dl, dt, dd, ul, ol, li, pre, form, fieldset, legend, button, input, textarea, th, td
            {
                margin: 0;
                padding: 0;
            }

            /* Default Font */
            body, button, input, select, textarea
            {
                font: 12px/1.5 \5b8b\4f53, arial, sans-serif;
            }

            h1, h2, h3, h4, h5, h6
            {
                font-size: 100%;
            }

            address, cite, dfn, em, var
            {
                font-style: normal;
            }

            code, kbd, pre, samp
            {
                font-family: courier new, courier, monospace;
            }

            small
            {
                font-size: 12px;
            }

            ul, ol
            {
                list-style: none;
            }

            a
            {
                text-decoration: none;
            }

            a:hover
            {
                text-decoration: underline;
            }

            sup
            {
                vertical-align: text-top;
            }

            sub
            {
                vertical-align: text-bottom;
            }

            legend
            {
                color: #000;
            }

            fieldset, img
            {
                border: 0;
            }

            button, input, select, textarea
            {
                font-size: 100%;
            }

            table
            {
                border-collapse: collapse;
                border-spacing: 0;
            }

            .col-main
            {
                float: left;
                width: 100%;
                min-height: 1px;
            }

            .col-sub, .col-extra
            {
                float: left;
            }

            .layout:after, .main-wrap:after, .col-sub:after, .col-extra:after
            {
                content: '\20';
                display: block;
                height: 0;
                clear: both;
            }

            .layout, .main-wrap, .col-sub, .col-extra
            {
                zoom: 1;
            }

            /* Common Features */
            .hidden
            {
                display: none;
            }

            .invisible
            {
                visibility: hidden;
            }

            /* Remove Float */
            .clear
            {
                display: block;
                height: 0;
                overflow: hidden;
                clear: both;
            }

            .clearfix:after
            {
                content: '\20';
                display: block;
                height: 0;
                clear: both;
            }

            .clearfix
            {
                *zoom: 1;
            }

            /* For non ie browsers also display the vertical scroll bar by default, to prevent the flicker caused by the scroll bar */
            html
            {
                overflow-y: scroll;
            }

            /* Default link styles */
            a:link, a:visited
            {
                text-decoration: none;
            }

            a:hover, a:active
            {
                text-decoration: underline;
            }

            body
            {
                height: 1500px;
            }

            .top
            {
                padding-top: 80px;
            }

            .menu
            {
                position: relative;
                width: 1210px;
                margin: 0px auto;
                height: 40px;
                background-color: #E4393C;
            }

            .menu div
            {
                position: absolute;
                top: 0px;
                height: 40px;
                font-family: "Microsoft Yahei";
            }

            .menu .all-sort
            {
                left: 0px;
                width: 210px;
                text-align: center;
                font-size: 14px;
            }

            .menu .all-sort a
            {
                color: #FFF;
                display: block;
                width: 100%;
                height: 100%;
                line-height: 40px;
            }

            .menu .ad
            {
                right: 0px;
                width: 141px;
            }

            .menu .nav
            {
                left: 210px;
            }

            .menu .nav ul li
            {
                float: left;
                width: 85px;
                line-height: 40px;
            }

            .menu .nav ul li a
            {
                display: block;
                width: 100%;
                color: #FFF;
                text-align: center;
                font: 700 15px/40px "Microsoft Yahei";
            }

            .menu .nav ul li a:hover, .menu .nav ul li a.current
            {
                background: #A40000;
                text-decoration: none;
            }

            .wrap
            {
                width: 1210px;
                margin: 0px auto;
            }

            .all-sort-list
            {
                position: relative;
                width: 203px;
                border: 2px solid #E4393C;
                border-top: none;
                padding: 3px 3px 3px 0px;
                background: #FAFAFA;
            }

            .all-sort-list .item
            {
                height: 30px;
                border-top: 1px solid #FFFFFF;
            }

            .all-sort-list .item.bo
            {
                border-top: none;
            }

            .all-sort-list .item h3
            {
                height: 28px;
                line-height: 28px;
                border: 1px 0px;
                font-size: 14px;
                font-weight: normal;
                width: 199px;
                overflow: hidden;
            }

            .all-sort-list .hover h3
            {
                position: relative;
                z-index: 13;
                background: #FFF;
                border-color: #DDD;
                border-width: 1px 0px;
                border-style: solid;
            }

            .all-sort-list .item span
            {
                padding: 0px 5px;
                color: #A40000;
                font-family: "\5B8B\4F53";
            }

            .all-sort-list .item a
            {
                color: #000;
                text-decoration: none;
            }

            .all-sort-list .item a:hover
            {
                font-weight: bold;
                color: #E4393C;
            }

            .all-sort-list .item-list
            {
                display: none;
                position: absolute;
                width: 705px;
                min-height: 200px;
                _height: 200px;
                background: #FFF;
                left: 198px;
                box-shadow: 0px 0px 10px #DDDDDD;
                border: 1px solid #DDD;
                top: 3px;
                z-index: 10;
            }

            .all-sort-list .item-list .close
            {
                position: absolute;
                width: 26px;
                height: 26px;
                color: #FFFFFF;
                cursor: pointer;
                top: -1px;
                right: -26px;
                font-size: 20px;
                line-height: 20px;
                text-align: center;
                font-family: "Microsoft Yahei";
                background: rgba(0, 0, 0, 0.6);
                background-color: transparent \9;
                filter: progid:DXImageTransform.Microsoft.Gradient(GradientType=1, startColorstr='#60000000', endColorstr='#60000000');
            }

            .item-list .subitem
            {
                float: left;
                width: 477px;
                padding: 0px 4px 0px 8px;
            }

            .item-list .subitem dl
            {
                border-top: 1px solid #EEE;
                padding: 6px 0px;
                overflow: hidden;
                zoom: 1;
            }

            .item-list .subitem .fore1
            {
                border-top: none;
            }

            .item-list .subitem dt
            {
                float: left;
                width: 54px;
                line-height: 22px;
                text-align: right;
                padding: 3px 6px 0px 0px;
                font-weight: 700;
                color: #E4393C;
            }

            .item-list .subitem dt a
            {
                color: #E4393C;
                text-decoration: underline;
            }

            .item-list .subitem dd
            {
                float: left;
                width: 415px;
                padding: 3px 0px 0px;
                overflow: hidden;
            }

            .item-list .subitem dd em
            {
                float: left;
                height: 14px;
                line-height: 14px;
                padding: 0px 8px;
                margin-top: 5px;
                border-left: 1px solid #CCC;
            }

            .item-list .subitem dd em a, .item-list .cat-right dd a
            {
                color: #666;
                text-decoration: none;
            }

            .item-list .subitem dd em a:hover, .item-list .cat-right dd a:hover
            {
                font-weight: normal;
                text-decoration: underline;
            }

            .item-list .cat-right
            {
                float: right;
                width: 210px;
            }

            .item-list .cat-right dl
            {
                width: 194px;
                padding: 6px 8px;
            }

            .item-list .cat-right dd
            {
                padding-top: 6px;
                line-height: 22px;
                overflow: hidden;
                padding: 3px 0px 0px;
            }

            .item-list .cat-right dt
            {
                padding: 3px 6px 0px 0px;
                font-weight: 700;
                color: #E4393C;
            }

            .item-list .cat-right dd a:hover
            {
                color: #666;
            }
        </style>
        <%-- 样式 --%>
        <body>
        <div class="top"></div>
        <!--导航 Start-->
        <div class="menu">
            <div class="all-sort"><h2><a href="">全部商品分类</a></h2></div>
            <div class="ad">
                <a href="">
                    <img src="http://img12.360buyimg.com/da/g14/M08/12/0D/rBEhVlJEA84IAAAAAAAZY9Mm2-UAADmFQNaVy4AABl7123.jpg" width="141" height="40"/>
                </a>
            </div>
            <div class="nav">
                <ul class="clearfix">
                    <li><a href="" class="current">首页</a></li>
                    <li><a href="">服装城</a></li>
                    <li><a href="">京东超市</a></li>
                    <li><a href="">团购</a></li>
                    <li><a href="">拍卖</a></li>
                    <li><a href="">在线游戏</a></li>
                </ul>
            </div>
        </div>
        <!--导航 End-->

        <!--所有分类 Start-->
        <div class="wrap">
            <div class="all-sort-list">
                <div class="item bo">
                    <h3><span>·</span><a href="">图书</a>、<a href="">音像</a>、<a href="">数字商品</a></h3>
                    <div class="item-list clearfix">
                        <div class="close">x</div>
                        <div class="subitem">
                            <dl class="fore1">
                                <dt><a href="#">电子书0</a></dt>
                                <dd><em><a href="#">免费</a></em><em><a href="#">小说</a></em><em><a href="#">励志与成功</a></em><em><a href="#">婚恋/两性</a></em><em><a href="#">文学</a></em><em><a href="#">经管</a></em><em><a href="#">畅读VIP</a></em></dd>
                            </dl>
                            <dl class="fore2">
                                <dt><a href="#">数字音乐</a></dt>
                                <dd><em><a href="#">通俗流行</a></em><em><a href="#">古典音乐</a></em><em><a href="#">摇滚说唱</a></em><em><a href="#">爵士蓝调</a></em><em><a href="#">乡村民谣</a></em><em><a href="#">有声读物</a></em></dd>
                            </dl>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--所有分类 End-->

        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript">
            $('.all-sort-list > .item').hover(function ()
            {
                var eq = $('.all-sort-list > .item').index(this),
                    h = $('.all-sort-list').offset().top,
                    s = $(window).scrollTop(),
                    i = $(this).offset().top,
                    item = $(this).children('.item-list').height(),
                    sort = $('.all-sort-list').height();

                if (item < sort)
                {
                    if (eq == 0)
                    {
                        $(this).children('.item-list').css('top', (i - h));
                    }
                    else
                    {
                        $(this).children('.item-list').css('top', (i - h) + 1);
                    }
                }
                else
                {
                    if (s > h)
                    {
                        if (i - s > 0)
                        {
                            $(this).children('.item-list').css('top', (s - h) + 2);
                        }
                        else
                        {
                            $(this).children('.item-list').css('top', (s - h) - (-(i - s)) + 2);
                        }
                    }
                    else
                    {
                        $(this).children('.item-list').css('top', 3);
                    }
                }

                $(this).addClass('hover');
                $(this).children('.item-list').css('display', 'block');
            }, function ()
            {
                $(this).removeClass('hover');
                $(this).children('.item-list').css('display', 'none');
            });

            $('.item > .item-list > .close').click(function ()
            {
                $(this).parent().parent().removeClass('hover');
                $(this).parent().hide();
            });
        </script>
        </body>
    </div>
</div>
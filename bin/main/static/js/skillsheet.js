/**
 * スキルシート画面関係のイベント
 */

jQuery(function($) {
  // inputを増やす動きを付ける

  // エンジニア検索画面で、追加ボタンを押した時の動き
  // 検索欄を増やす
  $(document).on("click", "#add", function() {
    $(this).parent().append(
      '<p>'+
      '<select class="widthbox">'+
          '<option value="">項目を選択してください</option>'+
          '<option value="">OS</option>'+
          '<option value="">NW/FW</option>'+
          '<option value="">DB</option>'+
          '<option value="">言語</option>'+
        '</select>'+
        '<span> </span>'+
        '<select  class="widthbox">'+
           '<option value="">項目の内容を選択してください</option>'+
           '<option value="">Springboot</option>'+
           '<option value="">Java</option>'+
          '<option value="">Linux</option>'+
          ' <option value="">PHP</option></option>'+
           '<option value="">Excel</option>'+
         '</select>'+
         '<span> </span>'+
        '<input class="widthbox inputwidth" type="text" placeholder="バージョン">'+
         '<span> </span>'+
        '<select  class="widthbox">'+
           '<option value="">経験年数を選択してください</option>'+
           '<option value="">1年以内</option>'+
           '<option value="">1年以上</option>'+
           '<option value="">3年以上</option>'+
           '<option value="">5年以上</option></option>'+
           '<option value="">10年以上</option>'+
         '</select>'+
      '<input type="button" class="del delrelative">'+
      '</p>');
});

  // add_dbクラスのついたボタンが押されたとき、DB欄を増やす
  // セレクトボックス＋テキストボックス＋削除ボタン。を挿入する
  $(document).on("click", ".add_db", function() {
      $(this).parent().append(
                '<p>'+
                '<select>'+
                '<option value="">指定なし</option>'+
                '<option value="">種類1</option>'+
                '<option value="">種類2</option>'+
                '<option value="">種類3</option>'+
                '<option value="">種類4</option>'+
              '</select>'+
              '<span></span>'+
              '<input class="inputskill" type="text" placeholder="バージョン">'+
              '<input type="button" class="del delrelative">'+
              '</p>'
      );
  });
  // add_db2クラスのついたボタンが押されたとき、DB欄を増やす
  // テキストボックス＋テキストボックス＋削除ボタン。を挿入する
  $(document).on("click", ".add_db2", function() {
      $(this).parent().append(
                '<p>'+
                '<input class="inputskill" type="text" placeholder="DB入力">'+
                '<span></span>'+
                '<input class="inputskill" type="text" placeholder="バージョン">'+
              '<input type="button" class="del delrelative"">'+
              '</p>'
      );
  });
  // add_fwクラスのついたボタンが押されたとき、FW/NW入力欄を増やす
  // テキストボックス＋テキストボックス＋削除ボタン。を挿入する
  $(document).on("click", ".add_fw", function() {
      $(this).parent().append(
                '<p>'+
              '<input class="inputskill" type="text" placeholder="FW/NW入力">'+
              '<span></span>'+
              '<input class="inputskill" type="text" placeholder="バージョン">'+
              '<input type="button" class="del delrelative"">'+
              '</p>'
      );
  });
  // add_osクラスのついたボタンが押されたとき、OS入力欄を増やす
  // セレクトボックス＋テキストボックス＋削除ボタン。を挿入する
  $(document).on("click", ".add_os", function() {
      $(this).parent().append(
            '<p>'+
            '<select>'+
            '<option value="">指定なし</option>'+
            '<option value="">種類1</option>'+
            '<option value="">種類2</option>'+
            '<option value="">種類3</option>'+
            '<option value="">種類4</option>'+
          '</select>'+
          '<span></span>'+
          '<input class="inputskill" type="text" placeholder="バージョン">'+
          '<input type="button" class="del delrelative"">'+
          '</p>'
      );
  });
  // add_os2クラスのついたボタンが押されたとき、OS入力欄を増やす
  // テキストボックス＋テキストボックス＋削除ボタン。を挿入する
  $(document).on("click", ".add_os2", function() {
      $(this).parent().append(
                '<p>'+
                '<input class="inputskill" type="text" placeholder="OS入力">'+
                '<span></span>'+
                '<input class="inputskill" type="text" placeholder="バージョン">'+
              '<input type="button" class="del delrelative"">'+
              '</p>'
      );
  });
  // add_laクラスのついたボタンが押されたとき、言語入力欄を増やす
  // セレクトボックス＋テキストボックス＋削除ボタン。を挿入する
    $(document).on("click", ".add_la", function() {
        $(this).parent().append(
              '<p>'+
              '<select>'+
              '<option value="">指定なし</option>'+
              '<option value="">種類1</option>'+
              '<option value="">種類2</option>'+
              '<option value="">種類3</option>'+
              '<option value="">種類4</option>'+
            '</select>'+
            '<span></span>'+
            '<input class="inputskill" type="text" placeholder="バージョン">'+
            '<input type="button" class="del delrelative"">'+
            '</p>'
        );
    });
  // add_la2クラスのついたボタンが押されたとき、言語入力欄を増やす
  // テキストボックス＋テキストボックス＋削除ボタン。を挿入する
    $(document).on("click", ".add_la2", function() {
        $(this).parent().append(
                  '<p>'+
                  '<input class="inputskill" type="text" placeholder="言語入力">'+
                  '<span></span>'+
                  '<input class="inputskill" type="text" placeholder="バージョン">'+
                '<input type="button" class="del delrelative"">'+
                '</p>'
        );
    });
  // add_otクラスのついたボタンが押されたとき、言語入力欄を増やす
  // テキストボックス＋テキストボックス＋削除ボタン。を挿入する
    $(document).on("click", ".add_ot", function() {
      $(this).parent().append(
                '<p>'+
                '<input class="inputskill" type="text" placeholder="その他入力">'+
                '<span></span>'+
                '<input class="inputskill" type="text" placeholder="バージョン">'+
              '<input type="button" class="del delrelative"">'+
              '</p>'
      );
  });




  // 追加した入力欄を消す
  $(document).on("click", ".del", function() {
      var target = $(this).parent();
      if (target.parent().children().length > 1) {
          target.remove();
      }
  });

  // 全ての入力したものをクリアする
  $('#clear').on('click',function() {
   $(this).parent('form').find(':text').val("");
   $('select').prop("selectedIndex", 0);
   $('input').prop('checked', false);
    document.getElementById("re").innerHTML ="下のボタンより選択してください";
  });

// モーダルウィンドウの動きの設定
{
  'use strict';
  const hiraku = document.getElementById('open');
  const tojiru = document.getElementById('close');
  const modal = document.getElementById('modal');
  const kakusu = document.getElementById('mask');

  hiraku.addEventListener('click', function () {
   modal.classList.remove('hidden');
   kakusu.classList.remove('hidden');
  });
  tojiru.addEventListener('click', function () {
   modal.classList.add('hidden');
   kakusu.classList.add('hidden');
  });
  kakusu.addEventListener('click', function () {
   modal.classList.add('hidden');
   kakusu.classList.add('hidden');
  });

  }

// モーダルウィンドウの閉じるボタンの動き
// モーダルウィンドウを閉じる
  window.addEventListener('DOMContentLoaded', function(){
    $('#close').click(function modaleffect() {
      const modal = document.getElementById('modal');
      const kakusu = document.getElementById('mask');
        modal.classList.add('hidden');
        kakusu.classList.add('hidden');
      });
    });
// モーダルウィンドウの確定ボタンの動き
// チェックボックスで選択したものを親画面に表示、モーダルウィンドウを閉じる
  window.addEventListener('DOMContentLoaded', function(){
    // モーダルウィンドウを閉じる
    $('#ok').click(function() {
    const modal = document.getElementById('modal');
    const kakusu = document.getElementById('mask');
    modal.classList.add('hidden');
    kakusu.classList.add('hidden');

    // チェックボックスで選択したものを抽出
    var input=[];
  $('input[name=checkboxfaze]:checked').each(function() {
    var plus = $(this).val();
    input.push(plus);
  });
  // 選択したものをから重複を消す
  var set = new Set(input);
  let setToArr = Array.from(set);
// 選択したものを親画面に表示、無かったら初期値を入れる
  if (input.length <1) {
    document.getElementById("re").innerHTML ="下のボタンより選択してください";
    } else {
      document.getElementById("re").innerHTML =setToArr;
    }

    });
  });

// モーダルウィンドウのクリアボタンの動き
// チェックボックスのチェックを外す
  $('#modalclear').on('click',function() {
    $('input').prop('checked', false);
    document.getElementById("re").innerHTML ="下のボタンより選択してください";
   });



});
//画面を読み込んだ時、子画面にチェックがあれば担当フェーズを表示する
$(document).ready(function(){
  var input=[];
  $('input[name=checkboxfaze]:checked').each(function() {
    var plus = $(this).val();
    input.push(plus);
  });
  var set = new Set(input);
  let setToAll = Array.from(set);
      if(setToAll.length==0){
        document.getElementById("re").innerHTML ="下のボタンより選択してください";
      }else{
      document.getElementById("re").innerHTML =setToAll;
      }
      $("#textareaHight").trigger('autoheight');
});


/* テキストエリアの初期設定. */
// 最小値height:100pxで指定
$("#textareaHight").height(30);
$("#textareaHight").css("lineHeight","20px");

/**
 * 高さ自動調節イベントの定義.
 * autoheightという名称のイベントを追加します。
 * @param evt
 */
$("#textareaHight").on("autoheight", function(evt) {
  // 対象セレクタをセット
  var target = evt.target;

  // CASE1: スクロールする高さが対象セレクタの高さよりも大きい場合
  // ※スクロール表示される場合
  if (target.scrollHeight > target.offsetHeight) {
    // スクロールする高さをheightに指定
    $(target).height(target.scrollHeight);
  }
  // CASE2: スクロールする高さが対象セレクタの高さよりも小さい場合
  else {
    // lineHeight値を数値で取得
    var lineHeight = Number($(target).css("lineHeight").split("px")[0]);

    while (true) {
      // lineHeightずつheightを小さくする
      $(target).height($(target).height() - lineHeight);
      // スクロールする高さが対象セレクタの高さより大きくなるまで繰り返す
      if (target.scrollHeight > target.offsetHeight) {
        $(target).height(target.scrollHeight);
        break;
      }
    }
  }
});

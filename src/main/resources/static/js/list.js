/**
 * 結果の表に関してのイベント
 */
jQuery(function($) {

    // レコード全体のどこをクリックされても移動できるようにする
    // 検索結果の表に関してのイベント
    $('tr[data-href]').addClass('clickable')

      //クリックイベント
      .click(function(e) {
        //e.targetはクリックした要素自体、それがa要素以外であれば
        if(!$(e.target).is('a')){
          //その要素の先祖要素で一番近いtrの
          //data-href属性の値に書かれているURLに遷移する
          window.location = $(e.target).closest('tr').data('href');}
    });

    // 検索結果の表でソートする
    $(document).ready(function(){
            $("#myTable").tablesorter( {
          headers: {
              7: { sorter: false }
          }
      } );
    });
});
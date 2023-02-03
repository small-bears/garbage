<div class="page_root" id="root_demo">
  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card_ad">
            <list_ad :list="list_ad" location="" v-if="$check_action('/ad/list', 'get')"
              style="marginbottom: 0.5rem" />
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <div class="sw_no">
            <div class="swiper_img">
              <swiper_img :list="list_slide" />
            </div>
            <div class="card_notice">
              <div class="notice_title"> <router-link to="notice/list"></router-link>
              </div>
              <swiper_notice :list="list_notice" />
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card_ad">
            <list_ad :list="list_ad" v-if="$check_action('/ad/list', 'get')" location="" />
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="warp" v-if="$check_action('/goods/list', 'get')">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <div class="article_recommend">
            <div class="title">
              <span>  </span>
            </div>
            <div class="more_box">
              <router-link to="/goods/list" class="more">
                <span></span>
              </router-link>
            </div>
            <div class="switch" @click="show_list_goods = !show_list_goods">
              <div class="switch_box">
                <span v-if="show_list_goods">  </span>
                <span v-else>  </span>
              </div>
            </div>
          </div>
          <list_goods v-if="show_list_goods" :list="list_goods" />

          <div class="overflow-auto" v-else>
            <table id="list_goods" role="table" aria-busy="false" :aria-colcount="fields_goods.length"
              class="table b-table table-striped table-hover">
              <thead>
                <tr>
                  <th v-for="(o,i) in fields_goods" :key="i">
                    {{o.label}}
                  </th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(o, i) in list_table_goods" :key="i">
                  <td v-for="(oj,n) in fields_goods" @click="to_details('goods',o)">
                    <img v-if="oj.type && oj.type == '图片' " :src="$fullUrl(o[oj.key])" alt=""
                      v-default-img="'/img/default.png'">
                    <span v-else-if="oj.key === 'create_time'">{{ o[oj.key] | formatDate}}</span>
                    <span v-else>{{ o[oj.key] }}</span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card_ad">
            <list_ad :list="list_ad" v-if="$check_action('/ad/list', 'get')" location="" />
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <div class="article_recommend">
            <div class="title">
              <span> </span>
            </div>
            <div class="more_box">
              <router-link to="/article/list" class="more">
                <span></span>
              </router-link>
            </div>
            <div class="switch" @click="show_list_article = !show_list_article">
              <div class="switch_box">
                <span v-if="show_list_article">  </span>
                <span v-else>  </span>
              </div>
            </div>
          </div>
          <list_article v-if="show_list_article" :list="list_article" />
          <div class="overflow-auto" v-else>
            <table id="list_article" role="table" aria-busy="false" :aria-colcount="fields_article.length"
              class="table b-table table-striped table-hover">
              <thead>
                <tr>
                  <th v-for="(o,i) in fields_article" :key="i">
                    {{o.label}}
                  </th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(o, i) in list_table_article" :key="i">
                  <td v-for="(oj,n) in fields_goods" @click="to_details('goods',o)">
                    <img v-if="oj.type && oj.type == '图片' " :src="$fullUrl(o[oj.key])" alt=""
                      v-default-img="'/img/default.png'">
                    <span v-else>{{ o[oj.key] }}</span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card_ad">
            <list_ad :list="list_ad" v-if="$check_action('/ad/list', 'get')" location="" />
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <div class="diy_recommend">
            <div class="title">
              <span> </span>
            </div>
            <div class="more_box">
              <router-link to="/product_information/list" class="more">
                <span></span>
              </router-link>
            </div>
            <div class="switch" @click="show_list_product_information = !show_list_product_information">
              <div class="switch_box">
                <span v-if="show_list_product_information">  </span>
                <span v-else>  </span>
              </div>
            </div>
          </div>
          <list_product_information v-if="show_list_product_information" :list="list_product_information" />
          <div class="overflow-auto" v-else>
            <table id="list_diy" role="table" aria-busy="false" :aria-colcount="fields_product_information.length"
              class="table b-table table-striped table-hover">
              <thead>
                <tr>
                  <th v-for="(o,i) in fields_product_information" :key="i">
                    {{o.label}}
                  </th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(o, i) in list_table_product_information" :key="i"
                  @click="to_details('product_information',o,'information_id')">
                  <td v-for="(oj,n) in fields_product_information">
                    <img v-if="oj.type && oj.type == '图片' " :src="$fullUrl(o[oj.key])" alt=""
                      v-default-img="'/img/default.png'">
                    <span v-else>{{ o[oj.key] }}</span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <div class="diy_recommend">
            <div class="title">
              <span> </span>
            </div>
            <div class="more_box">
              <router-link to="/custom_goods/list" class="more">
                <span></span>
              </router-link>
            </div>
            <div class="switch" @click="show_list_custom_goods = !show_list_custom_goods">
              <div class="switch_box">
                <span v-if="show_list_custom_goods">  </span>
                <span v-else>  </span>
              </div>
            </div>
          </div>
          <list_custom_goods v-if="show_list_custom_goods" :list="list_custom_goods" />
          <div class="overflow-auto" v-else>
            <table id="list_diy" role="table" aria-busy="false" :aria-colcount="fields_custom_goods.length"
              class="table b-table table-striped table-hover">
              <thead>
                <tr>
                  <th v-for="(o,i) in fields_custom_goods" :key="i">
                    {{o.label}}
                  </th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(o, i) in list_table_custom_goods" :key="i" @click="to_details('custom_goods',o,'goods_id')">
                  <td v-for="(oj,n) in fields_custom_goods">
                    <img v-if="oj.type && oj.type == '图片' " :src="$fullUrl(o[oj.key])" alt=""
                      v-default-img="'/img/default.png'">
                    <span v-else>{{ o[oj.key] }}</span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <div class="diy_recommend">
            <div class="title">
              <span> </span>
            </div>
            <div class="more_box">
              <router-link to="/website_announcement/list" class="more">
                <span></span>
              </router-link>
            </div>
            <div class="switch" @click="show_list_website_announcement = !show_list_website_announcement">
              <div class="switch_box">
                <span v-if="show_list_website_announcement">  </span>
                <span v-else>  </span>
              </div>
            </div>
          </div>
          <list_website_announcement v-if="show_list_website_announcement" :list="list_website_announcement" />
          <div class="overflow-auto" v-else>
            <table id="list_diy" role="table" aria-busy="false" :aria-colcount="fields_website_announcement.length"
              class="table b-table table-striped table-hover">
              <thead>
                <tr>
                  <th v-for="(o,i) in fields_website_announcement" :key="i">
                    {{o.label}}
                  </th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(o, i) in list_table_website_announcement" :key="i"
                  @click="to_details('website_announcement',o,'announcement_id')">
                  <td v-for="(oj,n) in fields_website_announcement">
                    <img v-if="oj.type && oj.type == '图片' " :src="$fullUrl(o[oj.key])" alt=""
                      v-default-img="'/img/default.png'">
                    <span v-else>{{ o[oj.key] }}</span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col">
          <div class="card_link">
            <list_link v-if="$check_action('/link/list', 'get')" :list="list_link" />
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
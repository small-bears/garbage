<div class="page_goods" id="goods_list">
  <div class="warp" v-if="$check_action('/goods/list', 'get')">
    <div class="container">
      <div class="row">
        <div class="col-12 col-lg-10 col-md-12">
          <div class="card_goods_list">
            <div class="good_list_title">
              <span class="title"></span>
              <!-- 搜索栏 -->
              <div class="search_box">
                <b-form-input size="sm" class="mr-sm-2" placeholder="局部搜索" v-model.trim="search_val"
                  @keyup.enter="submit_search" />
                <b-button size="sm" @click="submit_search">
                  <b-icon icon="search" />
                </b-button>
              </div>
            </div>
            <div class="filter_block">
              <!-- 筛选 -->
              <div class="bar_filter">
                <b-dropdown :text="title" variant="outline-dark" left>
                  <b-dropdown-item v-for="(o, i) in list_goods_type" :key="i" @click="filter_goods(o)">
                    {{ o }}
                  </b-dropdown-item>
                </b-dropdown>
              </div>
              <!-- /筛选 -->
              <!-- 排序 -->
              <div class="bar_sort" :class="{ active: query.orderby == '`hits` desc' }">
                <b-dropdown text="排序" variant="outline-dark" left>
                  <b-dropdown-item v-for="(o, i) in sort_list" :key="i" @click="sort_goods(o)">
                    {{ o.name }}
                  </b-dropdown-item>
                </b-dropdown>
              </div>
              <!--/排序 -->
            </div>
            <list_goods :list="list" />
          </div>
          <!-- 分页器 -->
          <div class="col overflow-auto flex_cc">
            <b-pagination v-model.number="query.page" :total-rows="count" :per-page="query.size" @change="goTo" />
          </div>
        </div>
      </div>
      <div class="row">

      </div>
    </div>
  </div>
</div>
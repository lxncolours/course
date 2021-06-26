<template>
  <div>
    <p>
      <button v-on:click="add()" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-edit"></i>
        新增
      </button>

      <button v-on:click="list(1)" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-refresh"></i>
        刷新
      </button>

    </p>
    <pagination ref="pagination" v-bind:list="list"></pagination>
    <table id="simple-table" class="table  table-bordered table-hover">
      <thead>
      <tr>
        <th>章节id</th>
        <th>课程id</th>
        <th>章节名称</th>
        <th class="hidden-480">操作</th>

      </tr>
      </thead>

      <tbody>
      <tr v-for="chapter in chapters">
        <td>{{ chapter.id }}</td>
        <td>{{ chapter.courseId }}</td>
        <td>{{ chapter.name }}</td>

        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button v-on:click="edit(chapter)" class="btn btn-xs btn-info">
              <i class="ace-icon fa fa-pencil bigger-120"></i>
            </button>
            <button v-on:click="del(chapter.id)" class="btn btn-xs btn-danger">
              <i class="ace-icon fa fa-trash-o bigger-120"></i>
            </button>
          </div>

          <div class="hidden-md hidden-lg">
            <div class="inline pos-rel">
              <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
              </button>

              <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                <li>
                  <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
																			<span v-on:click="edit(chapter)" class="green">
																				<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
																			</span>
                  </a>
                </li>

                <li>
                  <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
																			<span v-on:click="del(chapter.id)" class="red">
																				<i class="ace-icon fa fa-trash-o bigger-120"></i>
																			</span>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </td>
      </tr>


      </tbody>
    </table>

    <!-- Modal -->
    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">新增大章</h4>
          </div>
          <div class="modal-body">
            <form class="form-horizontal">
              <div class="form-group">
                <label class="col-sm-2 control-label">课程ID</label>
                <div class="col-sm-10">
                  <input v-model="chapter.courseId" class="form-control" placeholder="课程ID">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">课程名称</label>
                <div class="col-sm-10">
                  <input v-model="chapter.name" class="form-control" placeholder="课程名称">
                </div>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary" v-on:click="save()">保存</button>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
import Pagination from "../../components/pagination";

export default {
  name: 'chapter',
  components: {Pagination},
  data: function () {
    return {
      chapter: {},
      chapters: []
    }

  },
  methods: {
    add() {
      let _this = this;
      _this.chapter = {};
      $("#form-modal").modal("show");
    },
    save() {
      let _this = this;
      Loading.show();
      _this.$ajax.post("http://localhost:9000/business/admin/chapter/save", _this.chapter).then((response) => {
        Loading.hide();
        let resp = response.data;
        if (resp.success) {
          $("#form-modal").modal("hide");
          _this.list(1);
          Toast.success("保存成功！");
        }
      })
    },
    list(page) {
      let _this = this;
      Loading.show();
      _this.$ajax.post("http://localhost:9000/business/admin/chapter/findChapterList", {
        page: page,
        size: _this.$refs.pagination.size
      }).then((response) => {
        Loading.hide();
        let resp = response.data;
        _this.chapters = resp.content.list;
        _this.$refs.pagination.render(page, resp.content.total);
      })
    },
    edit(chapter) {
      let _this = this;
      _this.chapter = $.extend({}, chapter);
      $("#form-modal").modal("show");
    },
    del(id) {
      let _this = this;
      Confirm.show("删除大章后不可恢复，确认删除？", function () {
        Loading.show();
        _this.$ajax.delete("http://localhost:9000/business/admin/chapter/delete/" + id).then((response) => {
          Loading.hide();
          let resp = response.data;
          if (resp.success) {
            _this.list(1);
            Toast.success("删除成功！");
          }
        })
      });
    }
  }
  ,
  mounted: function () {
    let _this = this;
    _this.list(1);
  }
}
</script>
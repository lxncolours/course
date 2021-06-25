<template>

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
      <td>
        {{chapter.id}}
      </td>
      <td>{{chapter.courseId}}</td>

      <td class="hidden-480">
        {{chapter.name}}
      </td>

      <td>
        <div class="hidden-sm hidden-xs btn-group">
          <button class="btn btn-xs btn-success">
            <i class="ace-icon fa fa-check bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-info">
            <i class="ace-icon fa fa-pencil bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-danger">
            <i class="ace-icon fa fa-trash-o bigger-120"></i>
          </button>

          <button class="btn btn-xs btn-warning">
            <i class="ace-icon fa fa-flag bigger-120"></i>
          </button>
        </div>

        <div class="hidden-md hidden-lg">
          <div class="inline pos-rel">
            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
              <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
            </button>

            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
              <li>
                <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
																			<span class="blue">
																				<i class="ace-icon fa fa-search-plus bigger-120"></i>
																			</span>
                </a>
              </li>

              <li>
                <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
																			<span class="green">
																				<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
																			</span>
                </a>
              </li>

              <li>
                <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
																			<span class="red">
																				<i class="ace-icon fa fa-trash-o bigger-120"></i>
																			</span>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </td>
    </tr>

    <tr class="detail-row">
      <td colspan="8">
        <div class="table-detail">
          <div class="row">
            <div class="col-xs-12 col-sm-2">
              <div class="text-center">
                <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar"
                     src="assets/images/avatars/profile-pic.jpg"/>
                <br/>
                <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                  <div class="inline position-relative">
                    <a class="user-title-label" href="#">
                      <i class="ace-icon fa fa-circle light-green"></i>
                      &nbsp;
                      <span class="white">Alex M. Doe</span>
                    </a>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xs-12 col-sm-7">
              <div class="space visible-xs"></div>

              <div class="profile-user-info profile-user-info-striped">
                <div class="profile-info-row">
                  <div class="profile-info-name"> Username</div>

                  <div class="profile-info-value">
                    <span>alexdoe</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Location</div>

                  <div class="profile-info-value">
                    <i class="fa fa-map-marker light-orange bigger-110"></i>
                    <span>Netherlands, Amsterdam</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Age</div>

                  <div class="profile-info-value">
                    <span>38</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Joined</div>

                  <div class="profile-info-value">
                    <span>2010/06/20</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Last Online</div>

                  <div class="profile-info-value">
                    <span>3 hours ago</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> About Me</div>

                  <div class="profile-info-value">
                    <span>Bio</span>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xs-12 col-sm-3">
              <div class="space visible-xs"></div>
              <h4 class="header blue lighter less-margin">Send a message to Alex</h4>

              <div class="space-6"></div>

              <form>
                <fieldset>
                  <textarea class="width-100" resize="none" placeholder="Type something…"></textarea>
                </fieldset>

                <div class="hr hr-dotted"></div>

                <div class="clearfix">
                  <label class="pull-left">
                    <input type="checkbox" class="ace"/>
                    <span class="lbl"> Email me a copy</span>
                  </label>

                  <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                    Submit
                    <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </td>
    </tr>


    <tr class="detail-row">
      <td colspan="8">
        <div class="table-detail">
          <div class="row">
            <div class="col-xs-12 col-sm-2">
              <div class="text-center">
                <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar"
                     src="assets/images/avatars/profile-pic.jpg"/>
                <br/>
                <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                  <div class="inline position-relative">
                    <a class="user-title-label" href="#">
                      <i class="ace-icon fa fa-circle light-green"></i>
                      &nbsp;
                      <span class="white">Alex M. Doe</span>
                    </a>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xs-12 col-sm-7">
              <div class="space visible-xs"></div>

              <div class="profile-user-info profile-user-info-striped">
                <div class="profile-info-row">
                  <div class="profile-info-name"> Username</div>

                  <div class="profile-info-value">
                    <span>alexdoe</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Location</div>

                  <div class="profile-info-value">
                    <i class="fa fa-map-marker light-orange bigger-110"></i>
                    <span>Netherlands, Amsterdam</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Age</div>

                  <div class="profile-info-value">
                    <span>38</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Joined</div>

                  <div class="profile-info-value">
                    <span>2010/06/20</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Last Online</div>

                  <div class="profile-info-value">
                    <span>3 hours ago</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> About Me</div>

                  <div class="profile-info-value">
                    <span>Bio</span>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xs-12 col-sm-3">
              <div class="space visible-xs"></div>
              <h4 class="header blue lighter less-margin">Send a message to Alex</h4>

              <div class="space-6"></div>

              <form>
                <fieldset>
                  <textarea class="width-100" resize="none" placeholder="Type something…"></textarea>
                </fieldset>

                <div class="hr hr-dotted"></div>

                <div class="clearfix">
                  <label class="pull-left">
                    <input type="checkbox" class="ace"/>
                    <span class="lbl"> Email me a copy</span>
                  </label>

                  <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                    Submit
                    <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </td>
    </tr>


    <tr class="detail-row">
      <td colspan="8">
        <div class="table-detail">
          <div class="row">
            <div class="col-xs-12 col-sm-2">
              <div class="text-center">
                <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar"
                     src="assets/images/avatars/profile-pic.jpg"/>
                <br/>
                <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                  <div class="inline position-relative">
                    <a class="user-title-label" href="#">
                      <i class="ace-icon fa fa-circle light-green"></i>
                      &nbsp;
                      <span class="white">Alex M. Doe</span>
                    </a>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xs-12 col-sm-7">
              <div class="space visible-xs"></div>

              <div class="profile-user-info profile-user-info-striped">
                <div class="profile-info-row">
                  <div class="profile-info-name"> Username</div>

                  <div class="profile-info-value">
                    <span>alexdoe</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Location</div>

                  <div class="profile-info-value">
                    <i class="fa fa-map-marker light-orange bigger-110"></i>
                    <span>Netherlands, Amsterdam</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Age</div>

                  <div class="profile-info-value">
                    <span>38</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Joined</div>

                  <div class="profile-info-value">
                    <span>2010/06/20</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> Last Online</div>

                  <div class="profile-info-value">
                    <span>3 hours ago</span>
                  </div>
                </div>

                <div class="profile-info-row">
                  <div class="profile-info-name"> About Me</div>

                  <div class="profile-info-value">
                    <span>Bio</span>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xs-12 col-sm-3">
              <div class="space visible-xs"></div>
              <h4 class="header blue lighter less-margin">Send a message to Alex</h4>

              <div class="space-6"></div>

              <form>
                <fieldset>
                  <textarea class="width-100" resize="none" placeholder="Type something…"></textarea>
                </fieldset>

                <div class="hr hr-dotted"></div>

                <div class="clearfix">
                  <label class="pull-left">
                    <input type="checkbox" class="ace"/>
                    <span class="lbl"> Email me a copy</span>
                  </label>

                  <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                    Submit
                    <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </td>
    </tr>
    </tbody>
  </table>

</template>

<script>
export default {
  name: 'chapter',
  data: function () {
    return {
      chapters: []
    }

  },
  methods: {
    list: function () {
      let _this = this;
      _this.$ajax.get("http://localhost:9000/business/admin/chapter/findChapterList").then((response) => {
        _this.chapters = response.data;
      })
    }
  },
  mounted: function () {
    let _this = this;
    _this.list();
  }
}
</script>
package problems.medium

import java.util.stream.Collectors

fun main() {
//    val fileSystem = DesignFileSystem.FileSystem()
//
//    println(fileSystem.createPath("/a", 1))
//    println(fileSystem.get("/a"))
//
//    val fileSystem2 = DesignFileSystem.FileSystem()
//
//    println(fileSystem2.createPath("/leet", 1))
//    println(fileSystem2.createPath("/leet/code", 2))
//    println(fileSystem2.get("/leet/code"))
//    println(fileSystem2.createPath("/c/d", 1))
//    println(fileSystem2.get("/c"))
//
//    val fileSystem3 = DesignFileSystem.FileSystem()
//
//    println(fileSystem3.createPath("/uh", 1))
//    println(fileSystem3.createPath("/uh/yalb", 3))
//    println(fileSystem3.get("/uh/fan"))
//    println(fileSystem3.createPath("/uh/uhc", 2))
//    println(fileSystem3.get("/uh/uhc"))
//
    val util = DesignFileSystem.Util()

    util.readAndRun(listOf("createPath","createPath","get","createPath","get","get","get","createPath","get","get","createPath","createPath","get","createPath","createPath","createPath","get","get","get","createPath","get","createPath","createPath","createPath","createPath","createPath","get","createPath","createPath","get","get","get","createPath","get","createPath","createPath","createPath","createPath","createPath","get","createPath","get","createPath","get","createPath","createPath","createPath","createPath","get","get","createPath","createPath","get","get","get","get","createPath","get","get","get","get","get","get","createPath","get","get","createPath","get","get","createPath","createPath","get","createPath","get","createPath","createPath","createPath","get","get","get","get","get","get","get","createPath","get","createPath","get","createPath","createPath","get","get","get","get","get","createPath","createPath","createPath","get","createPath","get","get","get","get","createPath","createPath","get","createPath","createPath","createPath","createPath","get","get","get","createPath","get","get","get","get","createPath","createPath","createPath","createPath","get","createPath","createPath","createPath","createPath","createPath","createPath","createPath","createPath","get","createPath","get","get","get","get","get","get","get","createPath","createPath","get","createPath","createPath","get","get","get","createPath","createPath","get","get","createPath","get","get","createPath","get","get","get","createPath","get","createPath","createPath","createPath","createPath","createPath","get","get","createPath","createPath","createPath","createPath","createPath","createPath","get","get","get","createPath","get","get","createPath","createPath","get","get","get","get","createPath","createPath","get","createPath","createPath","createPath","createPath","createPath","createPath","createPath","get","get","get","get","get","get","get","get","get","get","createPath","get","get","createPath","createPath","createPath","createPath","createPath","get","createPath","createPath","createPath","createPath","createPath","get","get","get","createPath","get","createPath","createPath","get","get","createPath","createPath","get","get","get","get","createPath","createPath","get","get","createPath","get","createPath","get","get","get","createPath","createPath","createPath","createPath","createPath","get","createPath","get","get","get","get","get","get","get","createPath","get","createPath","createPath","get","createPath","get","createPath","createPath","createPath","get","createPath","get","get","get","get","createPath","get","createPath","get","createPath","createPath","createPath","createPath","get","get","createPath","createPath","get","get","createPath","createPath","get","createPath","createPath","get","get","createPath","get","createPath","createPath","createPath","get","get","createPath","createPath","get","get","get","createPath","get","get","createPath","get","get","createPath","createPath","createPath","get","createPath","get","get","createPath","get","get","get","get","get","createPath","get","get","createPath","get","get","get","get","get","get","get","createPath","createPath","createPath","createPath","get","createPath","createPath","createPath","get","createPath","createPath","get","createPath","createPath","get","get","get","get","get","createPath","createPath","createPath","get","createPath","createPath","createPath","createPath","get","get","createPath","createPath","get","createPath","get","get","createPath","createPath","createPath","get","createPath","get","get","get","createPath","get","get","get","createPath","createPath","get","createPath","get","createPath","get","get","createPath","createPath","createPath","get","createPath","get","createPath","get","createPath","createPath","createPath","createPath","createPath","get","createPath","createPath","createPath","createPath","createPath","createPath","get","get","get","createPath","get","createPath","createPath","createPath","createPath","get","get","createPath","get","get","createPath","createPath","get","get","createPath","createPath","createPath","createPath","get","createPath","createPath","get","createPath","createPath","get","get","createPath","createPath","createPath","get","createPath","get","createPath","get","createPath","get","get","createPath","get","get","get","get","get","createPath","createPath","get","get","get","get","get","createPath","get","createPath","createPath","createPath","get","createPath","createPath","get","createPath","createPath","createPath","get","createPath","createPath","get","createPath","get","createPath","get","createPath","createPath","get","get","createPath","get","createPath","get","get","get"),
        listOf("/la/xf/ug/znh/lpo/rao/pa/iib/jw,212845099","/la/zkf/bdu/x/uin,184708402","/uh/uhc/k/nsfp/ur","/la/e/y/rzts/dl,145020944","/la/xf/ug/znh/x/kccu","/la/zkf/bdu/x/db","/la/zkf/bdu/qzl/mh/o/rh/th","/uh/uhc/k/nsfp/iemj/quv,370479239","/la/zkf/bdu/x/uin","/la/xf/ug/znh","/la/xf/ug/znh/lpo/ayi/cabr/s,447399426","/la/xf/ug/znh/lpo/prs/lxd,319824244","/la/qwye/ilfn/zs","/la/zkf/bdu/goz,712853875","/uxx/dqde/tb,245857277","/la/xf/ug/znh/lpo/kqen,567328947","/la/e/s","/la/xf/ug/znh/lpo/ayi/nc/bdg/lui","/uh","/la/zkf/bdu/qzl/mh/kr,363264630","/uh/yalb/jmq","/la/qwye/gp,923433649","/tcc/ihcw,805663499","/la/zkf/bdu/qzl/mh/yiwq/lua,213475703","/la/xf/trm/ueuc,910911977","/la/zkf/bdu/x/db/p/ju,738755847","/la/xf/sjb","/la/xf/fx/if/z/op,905960531","/la/xf/fx/if,139914464","/la/zkf/bdu/goz","/la/xf/trm/ueuc/gawc/a","/la/zkf/bdu/x/y/ba","/la/xf/ug/w/dmn/ymc/fxvj/matn,148258760","/la/xf/ug/znh/lpo/ayi/nc","/la/xf/ug/znh/x/m/dagx,173399839","/la/zkf/bdu/qzl/keb/v/zdlz/z,512210777","/la/qwye,117992210","/la/zkf/bdu/qzl/mh/yiwq/lua/pqyb,502573487","/la/zkf/bdu/x/db/yyoj/vyxd,257979539","/la/zkf/bdu/goz/bae/iag","/la/xf/fx/if/z/uuc,918954465","/la/zkf/bdu/goz/bae","/la/xf/ug/znh/x/n/u,613699153","/la/xf/ug/znh/lpo/prs/uxrs","/la/xf/ug/znh/lpo/ayi/nc,809510119","/la/xf,367300140","/la/zkf/bdu/kp/drf,169922910","/la/zkf,56444369","/la/xf/trm/ueuc/aajh/hz","/la/xf/ug/w/ecj","/la/zkf/bdu/x/q/z/hfvj,210390487","/la/zkf/bdu/qzl/keb/v/zdlz,966265454","/la/xf/trm/ueuc/gawc","/la/zkf/bdu/x/db/gl/n","/la/zkf/bdu/qzl/kwwe","/la/zkf/bdu/qzl/mh/o/j","/la/qwye/ilfn,423937945","/la/zkf/bdu/qzl/keb/v","/la/zkf/bdu/x/q/z","/la/xf/fx","/la/zkf/bdu/x/of/dhqh/zki","/uh/yalb","/la/xf/ug/znh/x/n/u/dvq/anqu","/uh/yalb,305043734","/la/xf/fx/if/fwy","/la/qwye/ilfn/xvq","/la/qwye/d,332308821","/la/xf/ug/znh/lpo/kqen/y","/la/xf/ug/znh/x/kccu/suc","/la/zkf/bdu/x/of/dhqh/bj,751993191","/la/zkf/bdu/x/db/p/nrv,453943717","/la/xf/ug/znh/lpo/ayi","/la/e/y/rzts,538454948","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/ozze/cp","/la/xf/trm/ueuc/gawc,444891552","/la/zkf/bdu/x/db,483119359","/enn,629779849","/la/zkf/bdu/kp/fz","/la/zkf/bdu/qzl/ann","/la/xf/ug/znh/lpo/prs/uxrs/pm/vv/pgja","/la/xf/ug/w/mzp","/la/xf/ug/znh/lpo/ayi/mr/vja/yuub","/la/zkf/bdu/x/y/jf","/la/xf/ug/znh/x/m/dagx/u","/la/xf/ug/znh/x/m/dagx/u/suiu,13726410","/la/xf/ug/w/ecj/dx/ynoa","/la/zkf/bdu/qzl/kwwe/vrlq,632894209","/la/zkf/bdu/kp/fz/ufb","/la/e/hllx,440634387","/la/xf/ug/w/dmn/ymc,120334696","/la/xf/ug/w/ecj/dx","/la/xf/ug/znh/lpo/ayi/db","/la/zkf/bdu/x/of/ykfy","/la/zkf/bdu/kp/dp/npi","/la/e","/la/xf/ug/znh/x/n/u/dvq,185620307","/la/uvob,108236340","/la/xf/ug/znh/lpo/prs/wxt,153552432","/la/zkf/bdu/x/q","/la/xf/ug/znh/mx,477352472","/la/xf/ug/znh/x/m/dagx/u/suiu","/la/xf/ug/znh/mx/okz","/la/zkf/bdu/qzl/mh/yiwq/lua/dgjb","/la/xf/ug/znh/lpo/prs/wxt","/la/zkf/bdu/x/db/gl/n/wuk,792841992","/la/xf/ug/w/ecj,672160862","/la/e/y/rzts","/la/xf/ug/znh/lpo/prs/uxrs/pm/gp,29636657","/la/xf/ug/znh/lpo/kqen/oj,382796747","/la/zkf/bdu/x/q/cpv/c,445649135","/la/zkf/bdu/qzl/mh/o/rh/th,276752376","/la/xf/ug/znh/x","/la/xf/fx/if/tqgq/wlo/rog","/la/zkf/bdu/x/of/dhqh/bj","/la/zkf/bdu/kc,503906243","/la/xf/ug/w/ecj/ljlb/egeg","/la/xf/fx/if/z","/la/zkf/bdu/x/db/yyoj/l/rl","/la/e/y","/la/zkf/bdu/kp,648965799","/la/xf/ug/znh/lpo,430302726","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/ozze/cp,596892321","/la/xf/ug/znh/lpo/ayi/cabr/s/q,407625899","/la/xf/ug/znh/lpo/kqen/oj","/la/zkf/bdu/x/db/gl,804543493","/la/zkf/bdu/qzl/mh/o/j,86669760","/la/xf/ug/znh/lpo/rao,596705036","/la/e,297259645","/la/xf/ug/znh/lpo/ofkd,801194247","/la/xf/ug/w,650847936","/la/xf/ug/znh/x/n,233286367","/la/zkf/bdu/x/of/dhqh/zki/izwc,654345527","/la/xf/ug/znh/x/n","/la/zkf/bdu/x/db/p,298643707","/la/zkf/bdu/x/db/yyoj/vyxd/c","/la/zkf/swu/an","/la/zkf/bdu/x/db/yyoj/l/fq","/la/xf/ug/znh/lpo/prs/uxrs/pm","/la/zkf/bdu/qzl/keb/v/zdlz/z","/la/zkf/bdu/qzl/kwwe/vrlq","/la/xf/ug/znh/lpo/prs/uxrs/pm/ng/lh","/la/xf/ug/znh/qggf/m,833698090","/la/zkf/bdu/goz/oma,207070658","/la/xf/fx/if/z/op","/la/xf/ug/znh/lpo/rao/pa/l,846130723","/la/zkf/bdu/x/db/yyoj/l/rl/oh,853373637","/la/zkf/bdu/x/q/z/hfvj/amw/tchs/dg","/la/xf/ug/w/dmn/ymc/hcmf","/la/xf/ug/w/dmn/ymc","/uxx,520319745","/la/zkf/bdu/qzl/keb/v/yugy/znh,809493275","/la/xf/ug/znh/lpo/ofkd/vci","/la/zkf/bdu/x/q/z/hfvj","/la/zkf/bdu/fdf/iuka,913690137","/la/xf/ug/znh/lpo/ayi/nc/bdg/t","/la/zkf/bdu/qzl/mh/o","/la/xf/fx/if/tqgq/wlo/rog,720090645","/la/xf/ug/znh/lpo/rao","/la/xf/ug/znh/lpo/ayi/cabr/s","/la/uvob","/la/xf/ug/znh/qggf,7936419","/la/zkf/bdu/x/q/ofu","/la/zkf/bdu/qzl/mh/yiwq/lua/dgjb,541594593","/la/xf/ug/znh,744656466","/la/zkf/bdu,495245933","/la/xf/ug/znh/lpo/ayi/nc/bdg/lui,459508816","/la/zkf/bdu/x/y/jf,851652325","/la/zkf/bdu/kp/drf","/ij","/la/e/y/rzts/dl/dha,53624431","/la/zkf/xsxx,232948982","/la/zkf/bdu/goz/vyqv,659018286","/la/zkf/m,113624348","/uh/yalb/jmq,476081640","/la/xf/dlmf,543176877","/la/zkf/bdu/x/q/cpv","/la/qwye/gp","/la/zkf/bdu/qzl/mh/o/xgxu","/la/xf/ug/znh/lpo/rao/pa/iib,730067117","/la/xf/trm/ueuc","/la/xf/ug/w/dmn/ymc/fxvj/matn","/la/xf/ug/znh/lpo/ofkd/ziho,72113082","/la/zkf/bdu/x/q/z/hfvj/amw/tchs/dg,517551618","/la/qwye/d/lwzq","/la/xf/ug/znh/lpo/ofkd/ziho","/la/zkf/bdu/qzl/kwwe/jkz","/la/zkf/bdu/x","/la/xf/trm/ueuc/n,766714968","/la/uvob/siot,841725717","/la/xf/ug/w/dmn/u/cxei","/la/xf/trm/ueuc/aajh/e,212914795","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/tz/fo,121427167","/la/xf/fx,660127969","/la/zkf/g,418221674","/la/xf/ug/znh/lpo/rao/pa,10745842","/la,537093686","/la/xf/ug/w/ecj/dx/s,49262567","/la","/la/zkf/bdu/qzl/mh/o/h","/la/zkf/bdu/qzl/keb","/la/zkf/bdu/fdf/iuka/qosl","/la/xf/ug/znh/lpo","/uh/fan","/la/xf/ug/znh/qggf","/la/e/hllx","/la/zkf/bdu/x/db/yyoj/vyxd","/la/xf/ug/ixn","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/tz,784417612","/la/xf/ug/znh/lpo/prs/uxrs/jxmm","/la/zkf/bdu/qzl/keb/v/yugy/znh","/la/qwye/dysx/ij/xce,763385140","/la/xf/sjb,264295345","/la/zkf/bdu/x/db/yyoj/vyxd/c/dbcv,92999382","/la/xf/ug/znh/lpo/ayi/cabr/s/hn,872484556","/la/xf/ug/w/ecj/dx/ynoa,217164999","/la/xf/fx/ffe","/uh,600383471","/la/zkf/bdu/x/of/dhqh/zki,54867882","/la/zkf/bdu/x/db/yyoj/l/fq,171958129","/la/zkf/bdu/x/db/yyoj/vyxd/c,568486191","/la/xf/trm,180463043","/la/xf/ug","/la/xf/ug/znh/lpo/ofkd","/la/xf/ug/znh/lpo/rao/o","/la/zkf/bdu/x/q/ww,273448333","/la/zkf/bdu/x/db/p/nrv","/la/xf/ug/znh/lpo/prs/uxrs/pm/ng/lh,882506112","/la/zkf/bdu/qzl/keb,24852765","/la/zkf/bdu/x/db/p","/la/xf/ug/znh/lpo/ayi/cabr/s/q","/la/xf/ug/ixn,899703717","/la/qwye/ilfn/xvq,671561818","/la/zkf/bdu/x/db/yyoj/l/rl/oh","/la/qwye/dysx/ij","/la/zkf/bdu/x/db/gl","/la/zkf/bdu/x/db/gl/n/wuk","/la/xf/ug/znh/lpo/prs/uxrs/pm/vv/pgja/fww,596768423","/la/zkf/bdu/fdf/iuka/owd,143335364","/la/xf/ug/w/dmn/c","/la/xf/fx/if/z/uuc","/la/xf/ug/znh/lpo/prs/uxrs,531017718","/la/xf/ug/w/dmn/ymc/fxvj","/la/zkf/bdu/x,212331462","/la/zkf/bdu/x/of/dhqh/zki/izwc","/la/zkf/bdu/kc","/la/xf/trm/ueuc/aajh","/la/zkf/bdu/fdf/iuka/qosl,966571085","/la/zkf/bdu/qzl/mh/o/xgxu,758985608","/la/xf/ug/ixn/ldjz,159827768","/la/xf/ug/znh/x/m/dagx/u,782304012","/la/xf/trm/ueuc/aajh,321071570","/la/xf/ug/w/dmn","/la/qwye/dysx,460382343","/la/xf","/la/xf/ug/znh/lpo/ayi/nc/bdg","/la/zkf/bdu/qzl/keb/v/zdlz","/la/zkf/bdu/qzl","/la/zkf/xsxx/ytwl","/la/e/y/rzts/dl","/enn","/la/e/s,533903784","/la/xf/ug/znh/lpo/ayi/mr","/la/xf/ug/w/mzp,958726779","/la/xf/ug/znh/lpo/kqen/y,638085706","/la/zkf/bdu/qzl/mh/kr","/la/qwye/d/lwzq,116301846","/la/xf/ug/znh/x/n/u/dvq","/la/xf/fx/if/tqgq,375210837","/la/xf/ug/znh/x/m/vl,576355788","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/ozze,641809978","/uh/uhc","/uh/uhc/k/nsfp,341928246","/la/xf/ug/znh/lpo/prs/uxrs/pm/gp","/la/zkf/bdu/x/db/yyoj/vyxd/c/dbcv","/la/xf/fx/if/tqgq","/la/zkf/m","/la/xf/ug/w/dmn/ymc/fxvj,444239922","/la/zkf/bdu/goz/vyqv","/la/xf/ug/znh/lpo/ayi/nc/bdg/t,470860227","/la/qwye","/la/xf/ug/znh/x/m,665402778","/la/xf/trm/ueuc/aajh/hz,383277627","/la/xf/ug/znh/lpo/prs/uxrs/pm,950667328","/la/zkf/bdu/x/of/ykfy,374274945","/la/xf/fx/k","/la/zkf/bdu/x/q/cpv/c","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/tz/ppv,262033140","/la/xf/ug/znh/mx/okz,489999995","/la/zkf/bdu/qzl/mh/yiwq/lua/dgjb/bye","/la/xf/ug/znh/lpo/ayi/cabr","/la/zkf/bdu/qzl/kwwe,233826398","/uh/uhc/k/p,604754719","/la/zkf","/la/xf/ug/w/ecj/ljlb/egeg,774786925","/la/xf/ug/ixn/fvct,783843551","/la/zkf/bdu/x/q/pw/iw","/la/zkf/bdu/fdf","/la/zkf/bdu/qzl/kwwe/jkz,777817150","/la/xf/ug/w/n","/la/zkf/bdu/kp/fz,881861582","/la/zkf/bdu/x/q/pw,599533709","/la/zkf/bdu/qzl/mh/o,597602161","/la/xf/trm/ueuc/n","/la/xf/ug/znh/lpo/rao/pa/l","/la/qwye/dysx/ij,561749615","/uxx/dqde/mp,134929036","/la/xf/trm","/la/xf/ug/znh/lpo/prs/uxrs/pm/vv/pgja/fww","/la/zkf/bdu/qzl/mh","/la/zkf/bdu/qzl/kwwe/k,772586241","/la/zkf/bdu/x/q/ww","/uh/uhc/k/p","/la/xf/ug/znh/lpo/rao/o,366978103","/la/zkf/bdu/qzl/mh/o/h/gy","/la/zkf/bdu/fdf/iuka/owd","/la/zkf/bdu/qzl/mh/o/h/gy,929189968","/la/xf/ug/znh/lpo/ayi/mr/vja,505923220","/la/xf/ug/znh/lpo/ayi,519710854","/la/zkf/g/mht","/la/xf/fx/ffe,652907412","/la/zkf/bdu/qzl/keb/v/yugy","/la/zkf/bdu/x/q/z/hfvj/amw","/la/zkf/bdu/qzl/mh/o/j/el,520937323","/la/qwye/dysx","/la/xf/ug/znh/x/m/dagx","/la/zkf/xsxx","/uxx/dqde","/la/zkf/bdu/qzl/mh/o/rh/xuwp","/la/zkf/bdu/x/db/yyoj/l,217660112","/la/zkf/bdu/qzl/kwwe/vrlq/pbk","/la/apx","/la/xf/ug/znh/mx/mbia,220607243","/la/qwye/dysx/ij/umb","/la/zkf/bdu/x/db/yyoj/l","/uh/uhc/k/nsfp/iemj/quv","/la/uvob/siot","/la/xf/ug/znh/lpo/kqen","/la/zkf/bdu/x/q/pw","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/tz","/tcc,225694473","/la/xf/ug/znh/x/n/u/dvq/anqu,572633664","/la/zkf/g/hhn,224827391","/la/zkf/g/xn,172644610","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/ozze","/la/xf/ug/znh/lpo/ayi/nc/bdg,590410981","/uh/uhc/k,143017412","/la/xf/fx/k,499281740","/la/zkf/bdu/qzl/mh/yiwq/lua","/la/xf/ug/znh/x/kccu,761365146","/la/zkf/bdu/x/q/cpv,353177716","/la/xf/ug/znh/lpo/rao/pa","/la/zkf/bdu/x/q/z/hfvj/amw/tchs/ejee,778955963","/la/zkf/swu,306210484","/uh/uhc/odo","/tcc/ihcw","/la/zkf/bdu/x/db/yyoj","/la/zkf/g/xn","/la/xf/trm/ueuc/aajh/e","/la/zkf/bdu/x/q/z/hfvj/amw/tchs,823488797","/la/xf/ug/znh/x/kccu/suc,599459523","/la/zkf/bdu/x/db/gl/n,609753997","/uh/uhc/k/nsfp/iemj","/la/xf/fx/if/z,348088653","/la/zkf/bdu/kp/dp,32990344","/uh/uhc/k/nsfp/ur,254303611","/la/zkf/bdu/qzl/ann/c,793354325","/la/qwye/dysx/ij/xce","/la/xf/ug/znh/x/m/vl","/la/xf/ug/znh/lpo/ofkd/vci,778815711","/la/zkf/bdu/qzl/mh/o/rh/xuwp,318817413","/la/xf/ug/znh/mx/mbia","/uh/uhc/k/nsfp/ur/cy,161826916","/la/zkf/bdu/qzl/mh/o/j/w","/la/xf/ug/znh/x/n/u","/la/zkf/bdu/goz/bae/iag,662824914","/ij,232005313","/la/xf/ug/w/dmn/u/cxei,546219869","/la/xf/ug/znh/lpo/ayi/cabr/s/hn","/la/e/y,167206471","/la/zkf/bdu/fdf/iuka","/la/xf/ug/w/ecj/dx/s","/la/xf/ug/znh/x/kccu/iqye","/la/xf/ug/w/dmn/c,405382308","/tcc","/la/xf/ug/znh/lpo/rao/pa/iib","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/tz/ppv","/la/xf/ug/znh/lpo/prs,312157973","/la/qwye/ilfn/zs,256261575","/la/zkf/bdu/qzl/mh/yiwq/lua/pqyb","/la/zkf/bdu/x/db/yyoj/l/rl,532132496","/la/zkf/bdu/x/q/z/hfvj/amw/tchs/ejee","/uxx/dqde,529049931","/la/xf/ug/znh/lpo/prs/lxd","/la/zkf/m/ju","/uh/uhc,764714752","/la/xf/ug/znh/lpo/ayi/cabr/s/f,914776675","/uh/fan,543671901","/la/zkf/bdu/x/y","/la/zkf/bdu/qzl/mh/o/h,692774856","/uh/uhc/k/nsfp/ur/cy","/la/zkf/bdu/qzl/mh/yiwq/lua/dgjb/bye,592281001","/la/zkf/bdu/x/of/dhqh","/la/zkf/bdu/x/q,602705521","/la/xf/ug/w/dmn/ymc/fxvj/yi,501450148","/la/zkf/bdu/goz/bae,449638771","/la/xf/fx/if/tqgq/wlo,818701358","/la/zkf/bdu/x/q/z,404052253","/la/xf/ug/w","/la/apx,113804924","/la/zkf/xsxx/ytwl,595730818","/la/xf/ug/znh/x/kccu/iqye,618945057","/la/xf/ug/znh/lpo/prs/uxrs/jxmm,270376616","/la/zkf/bdu/kp/dp/npi,70793121","/la/zkf/bdu/kp/fz/ufb,699339012","/la/xf/ug/ixn/ldjz","/la/zkf/swu","/uh/uhc/k","/la/xf/ug/w/ecj/ljlb,131060794","/la/xf/ug/ixn/fvct","/la/zkf/bdu/x/db/yyoj,925161889","/la/zkf/bdu/qzl/ann,875622454","/la/qwye/dysx/ij/umb,195659616","/la/xf/ug/znh/lpo/ayi/cabr,729051801","/la/zkf/bdu/kp","/la/qwye/d","/la/xf/ug/znh/lpo/ayi/mr/vja/yuub,210817077","/la/zkf/bdu/x/db/p/ju","/la/qwye/ilfn","/la/xf/ug/w/dmn/u,812709834","/la/zkf/bdu/qzl/mh/o/j/w,485216499","/la/xf/ug/znh/lpo/ayi/mr/vja","/la/xf/trm/ueuc/vrh","/la/zkf/bdu/x/q/pw/iw,293736555","/la/xf/ug/znh/x,980257271","/la/zkf/bdu/qzl/kwwe/vrlq/pbk,755806109","/la/xf/fx/if/fwy,139547623","/la/zkf/bdu/qzl/ann/c","/la/zkf/bdu/x/q/ofu,834504497","/uh/uhc/k/nsfp/iemj,691177736","/la/zkf/bdu/x/q/z/hfvj/amw/tchs","/la/xf/ug/w/dmn/ymc/hcmf,602979983","/la/zkf/bdu/fdf,30686829","/la/zkf/bdu/qzl/mh/o/rh","/uxx","/uh/uhc/odo,606687861","/la/zkf/bdu/x/y,762425635","/la/zkf/bdu/qzl/mh,707663130","/uh/uhc/k/nsfp","/la/xf/ug/w/dmn,710475997","/la/zkf/bdu/kp/dp","/la/zkf/bdu/x/of/dhqh,52816855","/la/zkf/bdu","/la/xf/ug/znh/lpo/prs/uxrs/pm/vv/pgja,269671412","/la/xf/fx/if","/la/xf/ug/znh/mx","/la/xf/ug/znh/lpo/prs/uxrs/pm/ng,20173056","/la/xf/ug/znh/lpo/prs/uxrs/pm/vv","/la/xf/ug/znh/lpo/prs/uxrs/jxmm/tz/fo","/la/xf/dlmf","/uxx/dqde/tb","/la/xf/ug/znh/lpo/prs","/la/xf/ug,670327462","/la/xf/ug/znh/lpo/ayi/mr,146941954","/la/xf/ug/znh/x/m","/la/zkf/bdu/qzl/kwwe/k","/la/xf/ug/znh/lpo/ayi/cabr/s/f","/la/zkf/bdu/goz/oma","/la/zkf/g/hhn","/la/zkf/bdu/x/of,974464404","/la/zkf/bdu/qzl/mh/o/j/el","/la/zkf/bdu/qzl/mh/o/rh,503875049","/la/xf/ug/znh/lpo/prs/uxrs/pm/vv,60094691","/la/xf/trm/ueuc/vrh,831515749","/la/xf/fx/if/tqgq/wlo","/la/zkf/m/ju,76791222","/la/zkf/swu/an,72015583","/la/zkf/bdu/qzl/mh/yiwq","/la/xf/ug/w/n,602231887","/la/zkf/bdu/x/q/z/hfvj/amw,617010383","/la/zkf/bdu/x/y/ba,455799338","/la/zkf/g","/la/xf/trm/ueuc/gawc/a,973989476","/la/zkf/bdu/qzl/mh/yiwq,947689992","/la/xf/ug/znh/lpo/rao/pa/iib/jw","/la/xf/ug/w/ecj/dx,759164309","/uxx/dqde/mp","/la/zkf/bdu/qzl,764673327","/la/xf/ug/w/dmn/ymc/fxvj/yi","/la/xf/ug/znh/lpo/ayi/db,978385832","/la/zkf/g/mht,211557957","/la/zkf/bdu/x/of","/la/e/y/rzts/dl/dha","/la/zkf/bdu/qzl/keb/v/yugy,376144171","/la/xf/ug/znh/qggf/m","/la/zkf/bdu/qzl/keb/v,297429403","/la/xf/ug/znh/lpo/prs/uxrs/pm/ng","/la/xf/ug/w/dmn/u","/la/xf/ug/w/ecj/ljlb")
    )

}

class DesignFileSystem {
    class Util {
        fun readAndRun(opers: List<String>, args: List<String>) {
            val fileSystem = FileSystem()

            for (i in 0..opers.lastIndex) {
                if (opers[i] == "createPath") {
                    val splittedArgs = args[i].split(",")
                    println("createPath ${splittedArgs[0]}, ${splittedArgs[1]}")
                    println(fileSystem.createPath(splittedArgs[0], splittedArgs[1].toInt()))
                } else {
                    println("get ${args[i]}")
                    println(fileSystem.get(args[i]))
                }
            }
        }
    }


    class FileSystem {
        private val rootPath = Path("", 0)

        fun createPath(path: String, value: Int): Boolean {
            if (path == "/" || path == "") {
                return false
            }

            val pathList = path.split("/").stream().filter {
                it != ""
            }.collect(Collectors.toList())


            var pathIter = rootPath

            for (i in 0 until pathList.lastIndex) {
                if (pathIter.children[pathList[i]] == null) {
//                    println("nopath")
                    return false
                }

                pathIter = pathIter.children[pathList[i]]!!
            }

            if (pathIter.children[pathList.last()] == null) {
                pathIter.children[pathList.last()] = Path(pathList.last(), value)
            } else {
                return false
            }

            return true
        }

        fun get(path: String): Int {
            var pathIter = rootPath

            val pathList = path.split("/").stream().filter {
                it != ""
            }.collect(Collectors.toList())

            for (i in 0 until pathList.lastIndex) {
                if (pathIter.children[pathList[i]] == null) {
                    return -1
                }

                pathIter = pathIter.children[pathList[i]]!!
            }

            return if (pathIter.children[pathList.last()] == null) {
                -1
            } else {
                pathIter.children[pathList.last()]?.value!!
            }
        }

    }

    class Path(var name: String, var value: Int) {
        var children: MutableMap<String, Path> = HashMap()
    }
}
var express = require("express");
var router = express.Router();

var avisoController = require("../controllers/avisoController");

router.get("/listarAvisosCPU", function (req, res) {
    avisoController.listarAvisosCPU(req, res);
});
router.get("/listarAvisosRAM", function (req, res) {
    avisoController.listarAvisosRAM(req, res);
});

router.get("/listar", function (req, res) {
    avisoController.listar(req, res);
});

router.get("/listarComputadores/:idSetor", function (req, res) {
    avisoController.listarComputadores(req, res);
});

router.get("/verificarSetor/:idSetor", function (req, res) {
    avisoController.verificarSetor(req, res);
});

router.get("/listarUsb", function (req, res) {
    avisoController.listarUsb(req, res);
});
router.get("/listarSetor/:idMaquina", function (req, res) {
    avisoController.listarSetor(req, res);
});

router.get("/listar/:idUsuario", function (req, res) {
    avisoController.listarPorUsuario(req, res);
});

router.get("/pesquisar/:descricao", function (req, res) {
    avisoController.pesquisarDescricao(req, res);
});

router.post("/publicar/:idUsuario", function (req, res) {
    avisoController.publicar(req, res);
});

router.put("/editar/:idAviso", function (req, res) {
    avisoController.editar(req, res);
});

router.delete("/deletar/:idAviso", function (req, res) {
    avisoController.deletar(req, res);
});

router.get("/listarTodosComputadores", function (req, res) {
    avisoController.listarTodosComputadores(req, res);
});

router.get("/listarTodosFuncionarios", function (req, res) {
    avisoController.listarTodosFuncionarios(req, res);
});
module.exports = router;